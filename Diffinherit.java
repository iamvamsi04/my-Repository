class Parent {
    protected float protectedvar=10;
    private float privatevar=12;
    public float publicvar=11;
}

class child extends Parent {

    public void Dispaly() {
        System.out.println("public variable is "+publicvar);
        System.out.println("protected variable is "+protectedvar);
    }
}

public class Diffinherit {
    public static void main(String[] args) {
        child obj1 = new child();
        obj1.Dispaly();
        //System.out.println("protected variable is "+privatevar); results in error
    }
}
