class Parent {
    void Display() {
        System.out.println("I am parent class");
    }
}

class Child1 extends Parent {
    void print1() {
        System.out.println("I am child1 class");
    }
}

class Child2 extends Parent {
    void print2() {
        System.out.println("I am child2 class");
    }
}

public class Hinherit {
    public static void main(String[] args) {
        Parent Parent = new Parent();
        Child2 child2 = new Child2();
        Child1 child1 = new Child1();
        Parent.Display();
        child1.print1();
        child2.print2();
    }
}
