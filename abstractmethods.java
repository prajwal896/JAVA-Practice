/*abstract class pen{
    abstract void write();
    abstract void  refill();

}
class Fountainpen extends pen{
    void write(){
        System.out.println("i write in blue");
    }
    void refill(){
        System.out.println("i am refilling the pen");
    }
    void changenib(){
        System.out.println("i am changing nib of the pen");
    }
    

}

public class abstractmethods{
    public static void main(String[] args){
    Fountainpen f = new Fountainpen();
    f.write();
    f.changenib();
    f.refill();
    }
    
}*/
abstract class monkey{
    abstract void eat();
    abstract void bite();
}
interface animal{
    public void jump();
    void sleep();
}
class human extends monkey implements animal{
    void eat(){
        System.out.println("\n i eat");
    }
    void bite(){
        System.out.println("\n i bite");
    }
    public void jump(){
        System.out.println("\n i jump");
    }
    public void sleep(){
        System.out.println("\n i sleep");
    }
}
abstract class telephone{
abstract void ring();
abstract void lift();
abstract void disconnect();
}
class smartphone extends telephone{
    void ring(){
        System.out.println("\n i am ringing");
    }
    void lift(){
        System.out.println("\n i am lifting");
    }
    void disconnect(){
        System.out.println("\n i am disconnecting");
    }
    void googld(){
        System.out.println("\n i am using google");
    }
    }

interface tvremote{
    void on();
    void off();
    void changechannel();
}
interface smarttvremote extends tvremote{
    void netflix();
    void on();
    void off();
    void changechannel();
}
class tv implements smarttvremote{
    public void on(){
        System.out.println("\n i am on");
    }
    public void off(){
        System.out.println("\n i am off");
    }
    public void changechannel(){
        System.out.println("\n i am changing channel");
    }
    public void netflix(){
        System.out.println("\n i am using netflix");
    }
}
public class abstractmethods{

    public static void main(String[] args){
monkey h = new human();
h.eat();
h.bite();       
//h.jump();

smartphone t = new smartphone();
t.ring();
t.googld();
t.disconnect();  
tv s = new tv();
s.on();
s.changechannel();
s.off();
s.netflix();
}
}