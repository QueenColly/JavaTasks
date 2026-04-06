import java.util.Scanner;
public class TaskTwelve{ 
public static void main(String[] args){ 

    Scanner inputCollector = new Scanner(System.in);
    System.out.print ("Enter an integer : ");
    int integer = inputCollector.nextInt();
    
    //A. divisible by both 4 and 5
    if (integer % 4 == 0 && integer %5 == 0){
    System.out.printf("%d is divisible by 4 and 5", integer);
    }


    //divisibe by 4 or 5
    if (integer % 4== 0 ||  integer %5 == 0){
    System.out.print(integer +" is divisible by 4 or 5" +"\n");
    }


    //divisible by 4 or 5 but  not both
    if (integer %  4 == 0  || integer % 4 == 5){
    System.out.printf("%d is divisible by 4 or 5 but not both %n",integer);
    }




























}
}
