import java.util.Scanner;

public class TaskFourteen{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter weight: ");
    double weight = inputCollector.nextDouble();

    System.out.print("Enter height: ");
    double height = inputCollector.nextDouble();
    
    double pound = 0.45359237;
    double inch = 0.0254;

    double w = weight * 0.45359237;
    double h = height * 0.0254;
    double square = h * h; 
    
    double bmi = w/ square;

    System.out.printf("BMI : %.2f%n",bmi);

}
}
