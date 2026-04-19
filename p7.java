class greet extends Thread{
public void run(){
    int i=0;
    while(i<100){
        System.out.println("\nGood morning");
        i++;
    }
}
}
class greet1 extends Thread{
public void run(){
    int i=0;
    while(i<100){
        System.out.println("\nWelcome");
        i++;
    }
}
}
public class p7{
    public static void main(String[] args) {
        greet t1=new greet();
        greet1 t2 = new greet1();
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("\npriority  of 1 is " + t1.getPriority());
        System.out.println("\npriority  of 1 is " + t2.getPriority());
        t1.start();
        t2.start(); 

    }
}