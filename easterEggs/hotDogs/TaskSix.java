import java.util.Scanner;

public class TaskSix{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter a subtotal: ");
    double subtotal = inputCollector.nextDouble();

    System.out.print("Enter a gratuityRate: ");
    double gratuityRate = inputCollector.nextDouble();
    
    double division = gratuityRate/100;

    double gratuity = subtotal * division;
    double total = subtotal + gratuity;

    
    System.out.printf("Therefore Gratuity  : %.2f%nTotal: %.2f%n", gratuity, total);

}
}
