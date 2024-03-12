package WEEK6.Ques2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCounter {

    public static int countException(String fileName) throws IOException {
        int counter = 0;

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = br.readLine()) != null){
            if (line.contains("throws") || line.contains("catch") || line.contains("throw")){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String fileName = "E:\\Documents\\MCA\\Lab\\LabWorkSem2Java\\WEEK6\\Ques2\\ExceptionCounter.java";
        try{
            int counterException = countException(fileName);
            System.out.println("Total number of exceptions in the file: " + counterException);
        }
        catch (IOException e){
            System.err.println("Error reading the Java file: " + e.getMessage());
        }
    }
}
