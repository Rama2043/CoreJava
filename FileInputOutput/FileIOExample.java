package FileInputOutput;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String filePath = "D:\\Java\\example.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("Hello World.This is an example for Input and Output operations");
            writer.newLine();
            writer.write("We are working on files");
            System.out.println("Data written to file successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("Reading from a file.");
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
