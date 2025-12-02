import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            File f = new File("test.txt");;
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            fw.write("Hello World");
            fw.write("HIHIHIHIHIHI");fw.close();


            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

