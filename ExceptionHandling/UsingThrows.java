package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingThrows {
    public static void main(String[] args) {
        try{
            readFile();
        }
        catch(FileNotFoundException F){
            System.out.println("File not found");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("a.txt");
        Scanner scanner = new Scanner(file);
    }
}
