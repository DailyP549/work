public class js {
    static int a;
    {
        System.out.println("inside the instance ");
        int a= 20;
    }
    js(){
        System.out.println("the constructor");
         a=10;
    }
    public static void main(String[] args) {
        js z= new js();
        System.out.println("the value of a is :"+a);
    }
    
}
