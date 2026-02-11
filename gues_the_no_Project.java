import java.util.Random ;
import java.util.Scanner;

public class gues_the_no_Project {
    static class guess{

        public int random(){
        Random r = new Random();
        int num = r.nextInt(100);
        return num;
        }
public int input(){
    Scanner sc = new Scanner(System.in);
    int ip = sc.nextInt();
    return ip;
}
public int check(int inpt, int NUM, int score ){
if (inpt>NUM) {
    System.out.println("Number is still bigger");
    return 0;
}

else if (inpt==NUM) {
    System.out.println("Number is equal");
    System.out.println("you wonn, your score is = "+ score);
    boolean won = true;
    return 1;
}

else if(inpt< NUM) {
    System.out.println("Number is smalll");
return 0;
}
return 0;
}}
public static void main(String[] args){
    int score = 0;
    guess g = new guess();
int NUM = g.random();
    for(int i = 0;i<8;i++){
        score++;
System.out.println("the guesseed number is ="+NUM );

guess ip = new guess();
int inpt =ip.input();
int result = g.check(inpt, NUM, score);
if(result==1){
    break;
}
    }
//guess ch = new guess();
//int  

}
}
    