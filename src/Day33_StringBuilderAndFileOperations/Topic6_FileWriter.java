package Day33_StringBuilderAndFileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Topic6_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter MyWriter = new FileWriter("C:/Users/Lenovo/Desktop/Day33/NewFile.txt");

        MyWriter.write("This is an example of file writer!");
        MyWriter.write("This is second line");
        MyWriter.close();

    }
}
