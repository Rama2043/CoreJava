package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingToAFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("D:\\Java\\example.txt",true)){
            writer.write("Adding text to a existing file");
            System.out.println("Successfully appended to a file");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
