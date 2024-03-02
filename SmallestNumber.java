import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber  = in.nextInt();
        int secondNumber = in.nextInt();
        smallestNumber(firstNumber,secondNumber);
    }

    private static int smallestNumber(int firstNumber, int secondNumber) {
        int min;
        if (firstNumber > secondNumber) {
            return secondNumber;
        }else{
            return firstNumber;
        }
    }
}
