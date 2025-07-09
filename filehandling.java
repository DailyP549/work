import java.io.*;



public class filehandling {
    public static void main(String[] args) {
        try {
            File f1 = new File("file.txt");
            if(f1.createNewFile()){
                System.out.println("file Created "+f1.createNewFile());

            }
            else{
                System.out.println("File already exist .");
            }
            
        } catch (IOException e) {
            System.out.println("an error occured.");
           e.printStackTrace();
        }
        
    }
}
