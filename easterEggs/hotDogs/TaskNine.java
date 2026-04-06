import java.util.Scanner;

public class TaskNine{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter initial velocity u: ");
    double velocity = inputCollector.nextDouble();

System.out.print("Enter time span t: ");
double timeSpan = inputCollector.nextDouble();

System.out.print("Enter acceleration a: ");
double acceleration = inputCollector.nextDouble();

    double ut = velocity * timeSpan;
     System.out.print("ut : " + ut + "\n");

    double t = timeSpan * timeSpan;
    System.out.print("t :" + t + "\n");

    double at = acceleration * t;
    System.out.print("at :" + at + "\n");

    double denominator = 0.5* at;
    System.out.print ("denominator : " + denominator + "\n");

    double distance = ut + denominator;
       

System.out.printf("Total Displacement : %.2f%n", distance);

}
}

