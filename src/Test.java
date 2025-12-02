import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       try{
           File f = new File("ready.txt");
           f.createNewFile();
           if(f.createNewFile()){
               System.out.println("Successfully created a new file");
           }
           FileWriter fw = new FileWriter(f);
           fw.write("Fuck You;");
           fw.close();

           Scanner sc = new Scanner(f);
           while(sc.hasNextLine()){
               System.out.println(sc.nextLine());
           }
           sc.close();

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

