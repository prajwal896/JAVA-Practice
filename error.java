/*class d{
static int div(int a,int b,int c){
    return a+b/c;
}}*/

import java.util.Scanner;

public class error {
    public static void main(String[] args) {
      /*   int a=23;
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
    }*/
int a[]={1,2,3,4,5,6};
boolean flag = true;
while(flag==true){
    try {
        Scanner sc = new Scanner(System.in);
                            System.out.println("enter the array index");

        int r = sc.nextInt();
        if(r>=0 && r<=a.length){
                    System.out.println("array index is"+r+"in bound");
                    flag=false;
        }
        if(r<=0 || r>=a.length){
                    System.out.println("array index is"+r+"not in bound so retry");
                    
        }
        }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid input. Please enter a valid integer.");
    }
}}

}