package Week6.Ques3;

public class PreventiveMeasures {

    public static void main(String[] args) {
        int arr[] = null;
        //using preventive measures
        if (arr != null){
            System.out.println("The length of the array is " + arr.length);
        }
        else{
            System.out.println("Cannot get length due to Null point exception");
        }

    }
}
