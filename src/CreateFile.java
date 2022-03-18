
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File myObject = new File("javafilehand.txt");
            if(myObject.createNewFile()){
                System.out.println("Created file: "+ myObject.getName());
            }
            else{
                System.out.println("Created file: "+ myObject.getName());
                System.out.println("File name: " + myObject.getName());
                System.out.println("Absolute path: " + myObject.getAbsolutePath());
                System.out.println("Writeable: " + myObject.canWrite());
                System.out.println("Readable " + myObject.canRead());
                System.out.println("File size in bytes " + myObject.length());

                System.out.println("This file is already exists.");
            }

        }catch (IOException e){
            System.out.println("An error occurred: ");
            e.printStackTrace();
        }
    }
}
