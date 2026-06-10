class Parent {
    void protect() {
        System.out.println("I protect my children");
    }
}

class Child extends Parent {
    void protect() {
        System.out.println("I protect my siblings");
    }

    void play() {
        System.out.println("I play football");
    }
}
class Hello {
    public static void main(String a[]) {
        Parent p = new Child();
        p.protect();
        // p.play();
    }
}
