import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter a meter: ");
    double meter = inputCollector.nextDouble();

    double oneMeter = 3.2786;

    double feet = meter * oneMeter;

    System.out.printf("Therefore ft : %.2f .%n", feet);

}
}
