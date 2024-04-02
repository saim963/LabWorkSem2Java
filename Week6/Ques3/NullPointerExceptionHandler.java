package Week6.Ques3;

public class NullPointerExceptionHandler {

    public static void main(String[] args) {
        try{
            int arr[] = null;
            System.out.println("The length of the array is " + arr.length);

        }
        //using null pointer exception handler
        catch (NullPointerException e){
            System.out.println("The error is " + e.getMessage());
        }
    }
}
