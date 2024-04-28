public class RunnableThread   {
    int num;
    RunnableThread(int num){
        this.num = num;
    }
    public class InnerRunnableThread implements Runnable{
        public void run(){
            multiply();
        }  
    }

    void multiply(){
        for(int i=0;i<11;i++){
        System.out.println(num+" * "+i+" = "+num*i);
        }
    }
    public static void main(String[] args){
        Thread n1 = new Thread(new RunnableThread(2).new InnerRunnableThread());
        Thread n2 = new Thread(new RunnableThread(3).new InnerRunnableThread());
        n1.start();
        n2.start();
    }
    
}