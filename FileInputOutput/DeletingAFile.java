package FileInputOutput;

import java.io.File;

public class DeletingAFile {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\Example1.txt");
        if(file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
