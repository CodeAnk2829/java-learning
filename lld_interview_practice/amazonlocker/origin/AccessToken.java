package amazonlocker.origin;

import java.sql.Timestamp;

public class AccessToken {
    private String code;
    private Timestamp expiration;
    private Compartment compartment;

    public AccessToken(String code, Timestamp expiration, Compartment compartment) {
        this.code = code;
        this.expiration = expiration;
        this.compartment = compartment;
    }

    public boolean isExpired() {
        // if current time is greater than the expiration time, return true
        Timestamp now = new Timestamp(System.currentTimeMillis());
        if(now.after(this.expiration))
            return true;
        return false;
    }

    public boolean isValid(String tokenCode) {
        return tokenCode == this.code;
    }

    public Compartment getCompartment() {
        return this.compartment;
    }

    public String getCode() {
        return this.code;
    }
}
