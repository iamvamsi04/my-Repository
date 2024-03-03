class SuperClass {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    private void privateMethod() {
        System.out.println("Private method in SuperClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in SuperClass");
    }

    public void publicMethod() {
        System.out.println("Public method in SuperClass");
    }
}

class SubClass extends SuperClass {
    // No private members from SuperClass are directly accessible in SubClass

    // Protected members are inherited and accessible
    public void accessProtectedVar() {
        System.out.println("Protected variable in SubClass: " + protectedVar);
    }

    public void accessProtectedMethod() {
        protectedMethod();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();

        // Cannot access private members or methods of SuperClass in SubClass
        // subObj.privateVar; // Error
        // subObj.privateMethod(); // Error

        // Protected members and methods are accessible in SubClass
        subObj.accessProtectedVar();
        subObj.accessProtectedMethod();

        // Public members and methods are accessible in SubClass
        System.out.println("Public variable in SubClass: " + subObj.publicVar);
        subObj.publicMethod();
    }
}
