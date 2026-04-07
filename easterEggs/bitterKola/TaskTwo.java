import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){

    Scanner inputCollector = new Scanner (System.in);
    System.out.print("Enter a 5-digit number:");
    int number = inputCollector.nextInt();

    int firstNumber = number / 10000;
    System.out.print(firstNumber);

    int fifthNumber = number % 10;
    System.out.println(fifthNumber);

//    System.out.println(first number plus fifth number);
    int sum = firstNumber + fifthNumber;
    System.out.println("Sum of first and fifth number is : " + sum);
//    int number = 87492;
//
//    int firstNumber = number / 10000;
//    System.out.println(firstNumber);
//
//    
//    int secondNumber = number / 1000;
//    int result = secondNumber % 10;
//    System.out.println(result);
//
//    int thirdNumber = number / 100;
//    int mode = thirdNumber % 10;
//    System.out.println(mode);
//
//    int fourthNumber = number / 10;
//    int num = fourthNumber %10;
//    System.out.println(num);
//
//    int fifthNumber = number % 10;
//    System.out.println(fifthNumber);

    
    
 }
}
