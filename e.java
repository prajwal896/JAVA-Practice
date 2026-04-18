
class calc{
    void calc1(){
    System.out.println("i calculate");
    }
    protected  void calc3(){
    System.out.println("i calculate");
    }
}
class calculate extends calc{
    void calc2(){
        System.out.println("i calculate");
    }
}
public class e{
    public static void main(String[] args){
calculate c = new calculate();
c.calc1();
c.calc2();
c.calc3();
    }
