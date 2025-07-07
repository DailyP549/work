

public class jj {
    public static void main(String[] args) {
        System.out.println(Add.add(1,20));
 System.out.println(Add.add(1,20,30));

        }
    
}
class Add{
    public static int add(int a,int b,int c){
        return a+b+c;
    }public static int add(int a,int b){
        return a+b;
    }
}
