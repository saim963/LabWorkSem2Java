package Week5.ques1;
public class OddAndEven {
    int countOfOdd;
    int countOfEven;
    void addNumber(int num){
        if(num%2==0)    countOfEven++;
        else countOfOdd++;
    }
    String conToStr(){
        return "Number of odd: "+countOfOdd+" Number of Even: "+countOfEven;
    }
}