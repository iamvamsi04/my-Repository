class GrandParent {
    void Display() {
        System.out.println("I am parent class");
    }
}

class Parent extends GrandParent {
    void print1() {
        System.out.println("I am child1 class");
    }
}

class Child extends Parent {
    void print2() {
        System.out.println("I am child2 class");
    }
}

public class Mlinherit {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.Display();
        child1.print1();
        child1.print2();
    }
}