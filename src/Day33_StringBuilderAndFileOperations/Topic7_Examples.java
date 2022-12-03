package Day33_StringBuilderAndFileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Topic7_Examples {
    public static void main(String[] args) {
        try{
            FileReader FR = new FileReader("C:/Users/Lenovo/Desktop/Day33/top250.txt");
            BufferedReader MyReader = new BufferedReader(FR);

            String line = MyReader.readLine();
            while (line != null){
                System.out.println(line);
                 line = MyReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        }catch (IOException e){
            System.out.println("Error while reading file!");
        }
    }
}
