package amazonlocker.origin;

import amazonlocker.origin.utils.Size;

public class Client {
    public static void main(String[] args) {
        Compartment compartment1 = new Compartment(Size.LARGE);
        Compartment compartment2 = new Compartment(Size.MEDIUM);
        Compartment compartment3 = new Compartment(Size.SMALL);

        Compartment[] compartments = {
            compartment1, 
            compartment2, 
            compartment3,
        };
        Locker locker = new Locker(compartments);

        // Deposit package
        String accessToken = locker.depositPackages(Size.SMALL);
        System.out.println(accessToken);

        // Pickup package
        locker.pickup(accessToken);

        // deposit
        String accessToken2 = locker.depositPackages(Size.SMALL);
        System.out.println(accessToken2);

        // deposit compartment with the same size
        String accessToken3 = locker.depositPackages(Size.SMALL);
        System.out.println(accessToken3);

        // add a small size compartment and then deposit a package
        compartments[compartments.length - 1] = new Compartment(Size.SMALL);
        String accessToken4 = locker.depositPackages(Size.SMALL);
        System.out.println(accessToken4);

        // pickup with wrong access Token
        // locker.pickup("hello world");
        // locker.pickup("");

        locker.pickup(accessToken4);


        // again pickup with the used accessToken
        // locker.pickup(accessToken4);

    }
}
