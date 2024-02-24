import java.util.Scanner;
class Student{
    String fullname;
    int rollnum;
    double sempercentage;
    String collagename;
    int collagecode;
    Student(){
        sempercentage=100;
        collagename="MVGR";
        collagecode=33;
        System.out.println("student class constructed");
    }
    Student(String name,int roll,double semp){
        fullname=name;
        rollnum=roll;
        sempercentage=semp;
        collagename="MVGR";
        collagecode= 33;
        System.out.println("student class constructed");
    }
    protected void finalize()
    {
        System.out.println("student class destructed");
    }
}

public class Usingconstructor {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your full name,rollnum and sempercentage: ");
        String name =ip.nextLine();
        int roll = ip.nextInt();
        double semp =ip.nextDouble();
        Student defa = new Student();
        Student para = new Student(name, roll, semp);
        System.out.println("values of default constructor: ");
        System.out.println("fullname: "+defa.fullname+"\n"+"rollnum: "+defa.rollnum+"\n"+"sempercentage: "+defa.sempercentage+"\n"+"collagename: "+defa.collagename+"\n"+"collagecode:"+defa.collagecode+"\n");
        System.out.println("values of parametrized constructor: ");
        System.out.println("fullname: "+para.fullname+"\n"+"rollnum: "+para.rollnum+"\n"+"sempercentage: "+para.sempercentage+"\n"+"collagename: "+para.collagename+"\n"+"collagecode:"+para.collagecode+"\n");
        defa.finalize();
        para.finalize();
        ip.close();
    }
}