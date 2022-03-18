import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReaderClass {
    public static void main(String[] args){

        try{
            FileReader my_reader = new FileReader("javafilehand.txt");
            Scanner inputElements = new Scanner(my_reader);
            while(inputElements.hasNextLine()){
                String data = inputElements.nextLine();
                System.out.println(data);
            }


        }catch (IOException e){
            System.out.println("Something error is occurred!");
            e.printStackTrace();
        }

    }
}
