package FileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingWritingBinaryFile {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("D:\\Java\\image.png");
            FileOutputStream output = new FileOutputStream("D:\\Java\\image1.png")){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead=input.read(buffer))!=-1){
                output.write(buffer,0,bytesRead);

            }
            System.out.println("File Copied successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
