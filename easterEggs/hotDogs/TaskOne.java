import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter miles: ");  
    double miles = inputCollector.nextDouble();

    double oneMile = 1.6 ;
    double answer = miles * oneMile;

    System.out.printf("Answer is %.2f kilometer.%n", answer);
}
}
