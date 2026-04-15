import java.util.Scanner;
public class TaskOne{
public static void main (String[] args){

    Scanner inputCollector = new Scanner (System.in);
    System.out.print("Enter first integer: ");
    double first = inputCollector.nextDouble();

    System.out.print("Enter  second: ");
    double second = inputCollector.nextDouble();

    System.out.print("Enter  third: ");
    double third = inputCollector.nextDouble();

    System.out.print("Enter fourth: ");
    double fourth = inputCollector.nextDouble();

    System.out.print("Enter  fifth: ");
    double fifth = inputCollector.nextDouble();

    System.out.print("Enter  sixth: ");
    double sixth = inputCollector.nextDouble();

    System.out.print("Enter seventh: ");
    double seventh = inputCollector.nextDouble();

    System.out.print("Enter  eight: ");
    double eight = inputCollector.nextDouble();

    System.out.print("Enter ninth: ");
    double ninth = inputCollector.nextDouble();

    System.out.print("Enter tenth: ");
    double tenth = inputCollector.nextDouble();

    double sum = first + second + third + fourth + fifth + sixth + seventh + eight + ninth + tenth;
    double average = sum / 10;

    System.out.println("THe average is " + average);

    

}
}


//double first = 10;
//    double second = 5;
//    double third = 4;
//   double fifth = 6;
//    double seventh = 2;
//    double eighth = 9;
//    double ninth = 7
//    int tenth = 6;
//
//
