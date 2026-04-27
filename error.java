class d{
static int div(int a,int b,int c){
    return a+b/c;
}}
public class error {
    public static void main(String[] args) {
        int a=23;
        int b= 0;
        try {
            System.out.println("\n diviion is ="+a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("hfta");
        }
        try {
            d rr= new d();
            int j = rr.div(3,4,-1);
            System.out.println("\n illegal is ="+j);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("hehee");
        }
    }
}