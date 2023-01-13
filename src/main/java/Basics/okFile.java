package Basics;

import java.io.File;

public class okFile {
    public static void main(String[] args) {

        newFile();
    }

    private static void newFile() {

        try
        {
            String fName="okfileTest";
            String path="C:/Users/SoulReaper/Downloads/";
            File file1=new File(path+""+fName+".ok");
            file1.createNewFile();
            System.out.printf("Created new file");
        }catch(Exception ex1)
        {
            System.out.println("exception caught : "+ex1);
        }
    }
}
