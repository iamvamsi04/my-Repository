/* //the below code results error in java
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    // Inherits display() from class A
}

class C extends A {
    // Inherits display() from class A
}

class D extends B, C  // we can’t use “ , “ to inherit two classes 
 {
    // Compiler faces ambiguity here due to the Diamond Problem
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // Ambiguity: Which display() to call?
    }
} */

//to resolve this issue
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display1() {
        System.out.println("Class B");
    }
}

class C extends A {
    void display2() {
        System.out.println("Class C");
    }
}

class D extends B {
    void display3() {
        System.out.println("Class D");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
        obj.display1(); // Resolves the Diamond Problem by calling display() from Class D but can't inherit class C
        obj.display3();

    }
}
