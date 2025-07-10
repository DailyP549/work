

public class Class {

    int x=5;
    int y;
    public static void main(String[] args){
Class cl = new Class();
Class c2 = new Class();

System.out.println(cl.x);
System.out.println(c2.x);//--------------============CLASS EXAMPLE---------=========================
System.out.println(c2.y);
c2.x=90;
System.out.println(c2.x);

System.out.println(cl.x);System.out.println(cl.x);
//==========================THIS IS INSIDE A CLASS====================================
Mymet();
//======================this is a static method================================
c2.myPublicMethod();
//===========================this is a Public method=================================
//============axcissing a method with object==========================
Class c3 = new Class();
//c3.Method();
c2.met(20);
    }
    static void Mymet(){
        System.out.println("this is some method example called static");
    }
    public void myPublicMethod(){
        System.out.println("this is a public method ");
    }
    public void Metod(){
        System.out.println("thisMax Speed Is :");
    }
    public void met(int x){
        System.out.println("the value inside is :"+x);
    }
}
