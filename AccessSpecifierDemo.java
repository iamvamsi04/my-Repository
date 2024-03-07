import java.util.Scanner;
class Demo {
    private int priVar;
    protected int proVar;
    public int pubVar;
    void setVar(int priValue,int proValue, int pubValue){
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
        System.out.println("The value of private variable is "+priVar);
        System.out.println("The value of proVar variable is "+proVar);
        System.out.println("The value of pubVar variable is "+pubVar);
    }
    void getVar(){
        System.out.println("The value of private variable is "+priVar);
        System.out.println("The value of proVar variable is "+proVar);
        System.out.println("The value of pubVar variable is "+pubVar);
    }
}
public class AccessSpecifierDemo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the values to set private,protected and public variables ");
        int priVar = ip.nextInt();
        int proVar = ip.nextInt();
        int pubVar = ip.nextInt();
        Demo obj = new Demo();
        System.out.println("setting variables");
        obj.setVar(priVar,proVar,pubVar);
        System.out.println("getting variables");
        obj.getVar();
        ip.close();
    }
}