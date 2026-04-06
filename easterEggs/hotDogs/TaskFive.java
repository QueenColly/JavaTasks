import java.util.Scanner;

public class TaskFive{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter  squaremeter : ");
    double squareMeter = inputCollector.nextDouble();

    double oneSm = 0.3025;

    double calc= squareMeter * oneSm;

    System.out.printf("Therefore ping = %.2f ping.%n", calc);

}
}
