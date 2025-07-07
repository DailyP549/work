
public class ExceptionHandling {
   

    public static void main(String[] args) {
        
//         int n= 10;
//         int m= 0;
//         try{
//         int ans = n/m;
//         System.out.println("answer : "+ ans);
//     }
//     catch(ArithmeticException e){
//         System.out.println("Error:Drivision by zero is not allowed");

//     }
//     finally{
//         System.out.println("program continues after handling the exception.");

//     }
// }
//     public ExceptionHandling() {
//     }
try {
    

int[] n= new int[5];
int divisior =0;
for(int i = 0; i<n.length;i++){
    int res =n[i]/divisior;
    System.out.println(res);
}} 
catch (ArithmeticException e) {
    throw new RuntimeException("error:Division by zero occured",e);
}




}
}