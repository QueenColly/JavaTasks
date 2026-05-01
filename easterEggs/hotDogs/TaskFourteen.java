import java.util.Scanner;

public class TaskFourteen{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    double weight = getValueFromUser(inputCollector,"weight")
    double height = getValueFromUser(inputCollector,"height")
    
    double pound = 0.45359237;
    double inch = 0.0254;
    

    double w =multiplyingTwoNumbers(weight,pound);
    double h = multiplyingTwoNumbers(height,inch);
    double square = multiplyingTwoNumbers(height,height);
    
    double bmi = dividingTwoNumbers( w, square);
    System.out.printf("BMI : %.2f%n",bmi);

}

public static double getValueFromUser(Scanner inputCollector,String detail){
    System.out.print("Enter"+detail+":");
    double weight = inputCollector.nextDouble();
    return weight;
}
public static double multiplyingTwoNumbers(double bodymass,double multiplier){
double result = bodymass*multiplier;
return result;
}

public static double dividingTwoNumbers(double w,double square){
double bmi = w / square;
return bmi;
}
}
