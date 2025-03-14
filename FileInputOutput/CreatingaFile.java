package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class CreatingaFile {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Java\\Example1.txt");
            if(file.createNewFile()){
                System.out.println("File created: "+file.getName());
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
