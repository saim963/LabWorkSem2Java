package Week6.Ques3;

public class DefaultExceptionHandler {

    public static void main(String[] args) {
        try{
            int arr[] = null;
            System.out.println("The length of the array is " + arr.length);

        }
        //using default exception handler
        catch (Exception e){
            System.out.println("The error is: " + e.getMessage());
        }
    }
}
