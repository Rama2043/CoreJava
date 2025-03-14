package FileInputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyingAFile {
    public static void main(String[] args) {
        Path source = Paths.get("D:\\Java\\example.txt");
        Path destination = Paths.get("D:\\Java\\Copy.txt");
        try{
            Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
