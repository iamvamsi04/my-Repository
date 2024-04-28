public class ThreadClass extends Thread{
    int num;
    ThreadClass(int num){
        this.num = num;
    }
    public void run(){
        multiply();
    }

    void multiply(){
        for(int i=0;i<11;i++){
        System.out.println(num+" * "+i+" = "+num*i);
        }
    }
    public static void main(String[] args){
        ThreadClass n1 = new ThreadClass(2);
        ThreadClass n2 = new ThreadClass(3);

        n1.start();
        n2.start();
    }
}