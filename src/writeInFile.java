import java.io.FileWriter;
import java.io.IOException;

public class writeInFile {
    public static void main(String[] args){
        try {
            FileWriter somethingIn = new FileWriter("javafilehand.txt");
            somethingIn.write("I am newly started this language Java EE. i hope it will complete soon!");
            somethingIn.close();
            System.out.println("Successfully written something in file!");
        }catch (IOException e){
            System.out.println("An error is occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter someNew = new FileWriter("javafilehand.txt");
            someNew.write(" this language is too interesting and essy!");

            someNew.close();
            System.out.println("Successfully Done!!!");

        }catch (IOException a){
            System.out.println("Error is occurred");
            a.printStackTrace();
        }
    }
}
