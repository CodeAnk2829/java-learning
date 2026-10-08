package amazonlocker.origin;

import java.sql.Timestamp;
import java.util.*;

import amazonlocker.origin.utils.Size;


public class Locker {
    private Compartment compartments[];
    private Map<String, AccessToken> tokenMapping;

    public Locker(Compartment compartments[]) {
        this.compartments = compartments;
        this.tokenMapping = new HashMap<>();
    }

    private Compartment getAvailableCompartment(Size pkgSize) {
        for(Compartment c : this.compartments) {
            if(!c.isOccupied() && c.getSize() == pkgSize) {
                return c;
            }
        }
        return null;
    }

    private AccessToken getAccessTokenCode(Compartment c) {
        String token = "access_token_code";
        Timestamp expiry = new Timestamp(
            System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000
        );
        return new AccessToken(token, expiry, c);
    }

    private void clearDeposit(AccessToken accessToken) {
        Compartment compartment = accessToken.getCompartment();
        String accessTokenCode = accessToken.getCode();
        compartment.markFree();
        this.tokenMapping.remove(accessTokenCode);
    }

    public String depositPackages(Size pkgSize) {
        // 1. check the available compartments -> getAvailableCompartment of size == pkgSize
        Compartment availableCompartment = getAvailableCompartment(pkgSize);

        // 2. Throw error if all compartments are occupied
        if(availableCompartment == null) {
            throw new RuntimeException("No compartment is available.");
        }

        // 3. Once found an available compartment, open it
        availableCompartment.open();

        // 4. Generate access token code -> getAccessTokenCode
        AccessToken accessToken = getAccessTokenCode(availableCompartment);
        
        // 5. Mark as occupied
        availableCompartment.markOccupied();

        // 6. Save the code in the lookup
        this.tokenMapping.put(accessToken.getCode(), accessToken);

        // 7. Return the access token code
        return accessToken.getCode();
    }

    public void pickup(String code) {
        if(code == null || code.isEmpty())
            throw new RuntimeException("Invalid access token code");

        AccessToken pickupCode = this.tokenMapping.get(code);
        
        // 1. validate the code
        if(pickupCode == null || !pickupCode.isValid(code)) {
            throw new RuntimeException("Invalid access token code");
        }

        // 2. Check if the pickup code is expired 
        if(pickupCode.isExpired()) {
            throw new RuntimeException("The pickup code is expired.");
        }

        // 3. open the compartment
        Compartment c = pickupCode.getCompartment();
        c.open();

        // clear the deposit
        this.clearDeposit(pickupCode);
        System.out.println("Pickup Successful.");
    }

    public void openExpiredCompartments() {
        // 1. opens expired compartements
        for(AccessToken accessibleCompartment : this.tokenMapping.values())
            if(accessibleCompartment.isExpired())
                accessibleCompartment
                .getCompartment()
                .open();     
    }
}
