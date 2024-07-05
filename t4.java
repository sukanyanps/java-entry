import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();                     //input first number
        System.out.println("Enter second number");
        int number2 = sc.nextInt();                     //input second number
        System.out.println("Guess the sum");
        int number3 = sc.nextInt();
        int sum = number1+number2;                      //input guess

        if(sum == number3){
            System.out.println("Correct anwser!");      //ptint correct answer
        } else if(sum != number3) {
            System.out.println("Wrong anwser!");        //print wrong answer
            System.out.println(number1+ " + " + number2 + " = " +sum);
        }

    }
}
