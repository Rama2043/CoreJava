package FileInputOutput;

import java.io.File;

public class ListingFilesInDirectory {
    public static void main(String[] args) {
        File directory = new File("D:\\Java\\New\\");
        String[] file = directory.list();
        if(file.length>0){
            for(String files:file){
                System.out.println(files);
            }
        }
        else{
            System.out.println("Directory is empty");
        }
    }
}
