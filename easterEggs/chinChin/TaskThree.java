import java.util.Scanner;
public class TaskThree{ 
public static void main(String[] args){ 

    Scanner inputCollector = new Scanner(System.in);
    System.out.print ("Enter an integer : ");
    int integer = inputCollector.nextInt();
  
    if (integer % 5 == 0){ 
    System.out.print("HiFive" +"\n");
    }

    if (integer % 2 == 0){ 
    System.out.print("HiEven" +"\n");
    }
}
}
