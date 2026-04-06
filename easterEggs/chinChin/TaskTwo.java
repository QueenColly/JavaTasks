import java.util.Scanner;
public class TaskTwo{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter the month :");
    String month = inputCollector.nextLine();

    System.out.print("Enter the year : ");
    int year = inputCollector.nextInt();

    int daysOfTheMonth = 0;

    if (month.equals("January")){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n");  
   }

    if (month.equals("February" && year % 400 == 0)){
        daysOfTheMonth = 29;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n");   
 }
 
    if (month.equals("February" && year % 400 != 0 )){
        daysOfTheMonth = 28;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ;  
  }
    
    if (month == "March"){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n");
     }


    if (month == "April"){
        daysOfTheMonth =  30;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ;  
  }

    if (month == "May"){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ;  
  }

   
    if (month == "June"){
        daysOfTheMonth = 30 ;
      System.out.print("Number of days in a month : " + daysOfTheMonth + "\n");     
 }
   

    if (month == "July"){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ; 
   }

    if (month == "August"){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n")  ;  
 }

    if (month == "September"){
        daysOfTheMonth =  30;
      System.out.print("Number of days in a month : " + daysOfTheMonth + "\n");     
    
  }

    if (month == "October"){
        daysOfTheMonth = 31;
     System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ; 
   }

    if (month == "November"){
        daysOfTheMonth = 30 ;
    System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ;    
 }

    if (month == "December"){
        daysOfTheMonth = 31;
    System.out.print("Number of days in a month : " + daysOfTheMonth + "\n") ;    
}

//    int result = 7 / 2;
//    int resultTwo = 7 % 2; 

//    System.out.print("Result ; " +result + "\n");
//    System.out.print("REsults : " + result + "\n");
//
  
 }
}
