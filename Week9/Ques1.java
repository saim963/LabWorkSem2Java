package Week9;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ques1 {
//    public static final org.apache.log4j.Logger logger = Logger.getLogger(Q1.class);

    public static class FileNotThereException extends FileNotFoundException {
        public FileNotThereException(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\Documents\\MCA\\Lab\\LabWorkSem2Java\\Week9\\test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.print(line+"\n");
        }
        catch (IOException e){
            throw new FileNotThereException("File is not present!!");
        }
//        finally {
//            logger.info("File Closed - Might not been read!!");
//        }
    }
}
