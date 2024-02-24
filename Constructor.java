import java.util.Scanner;
class Student{
    String fullname;
    int rollnum;
    double sempercentage;
    String collagename;
    int collagecode;
    Student(String name,int roll,double semp,String cn,int cc){
        fullname=name;
        rollnum=roll;
        sempercentage=semp;
        collagename=cn;
        collagecode=cc;
        System.out.println("student class constructed");
    }
    protected void finalize()
    {
        System.out.println("student class destructed");
    }
}

public class Constructor {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your full name,rollnum,sempercentage,collage name,collage code: ");
        String name =ip.nextLine();
        int roll = ip.nextInt();
        double semp =ip.nextDouble();
        String cn = ip.next();
        int cc = ip.nextInt();
        Student abc = new Student(name, roll, semp, cn, cc);
        System.out.println("fullname: "+abc.fullname+"\n"+"rollnum: "+abc.rollnum+"\n"+"sempercentage: "+abc.sempercentage+"\n"+"collagename: "+abc.collagename+"\n"+"collagecode:"+abc.collagecode+"\n");
        abc.finalize();
        ip.close();
    }
}