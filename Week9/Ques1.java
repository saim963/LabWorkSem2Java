package Week9;

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
        String location = "E:\\Documents\\MCA\\Lab\\LabWorkSem2Java\\Week9\\test.txt";
        try(FileReader fr = new FileReader(location)){
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
        catch (IOException e){
            throw new FileNotThereException("File is not present!!");
        }
//        finally {
//            logger.info("File Closed - Might not been read!!");
//        }

    }
}
