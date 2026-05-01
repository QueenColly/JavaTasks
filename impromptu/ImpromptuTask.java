import java.util.Scanner;
public class ImpromptuTask{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
     System.out.print("Enter number: ");
    int number = input.nextInt();
    
    int sum = 0;
 
    while(number > 0){  
   int digit = number % 10;
   number = number/ 10;
     sum += digit;

    if( number == 0){
    break;
    }

   }
     System.out.println("The SUM is: " + sum);
    
}
}

//    for(number)
//

    
