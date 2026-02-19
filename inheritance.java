// creating class circle ad creating one classs cylinder a dn using inheritance in that

/*public class  inheritance{
    static class circle{
        int radius = 45;
        public void rad(){
            System.out.println(" raidus of circle is ="+radius);
        }
    }
    static class cylinder extends circle{
        int height = 34;
        public void hei(){
            System.out.println(" raduis of circle is ="+radius+" and hegiht of cylinde ris ="+height);
        }
    }
public static void main(String[] args){
    cylinder cy = new cylinder();
    cy.hei();
    }
}*/

// creating rectancle addn cuboid class and using inhertance in that and keeeping as close to real world

/*public class inheritance{
static class rectancle {
    int h = 5;
    int b = 6;
    public void display(){
        System.out.println(" height is ="+h+"breadth of rec is ="+b);
    }
}
static class cuboid extends rectancle {
int l=3434;
public void display(){
    System.out.println("height of cubiod is ="+h+"breadth of cubido of is = "+b+"lenght of cubiod is="+l);
}
    
}
public static void main(String[] args) {
    cuboid c = new cuboid();
    c.display();
}



}*/

public class  inheritance{
    static class circle{
        int radius = 45;
        public void rad(){
            System.out.println(" raidus of circle is ="+radius);
        }
        public void area(){
            System.out.println("area  of circle ="+Math.PI*radius*radius);
        }
    }
    static class cylinder extends circle{
        int height = 34;
        public void hei(){
            System.out.println(" raduis of circle is ="+radius+" and hegiht of cylinde ris ="+height);
        }
public void volume(){
    System.out.println("area of cyliner ="+2*Math.PI*radius*height+" and voumen of cylinder = "+Math.PI*radius*radius*height);
}
    }
public static void main(String[] args){
    cylinder cy = new cylinder();
    cy.area();
    cy.volume();
    }
}