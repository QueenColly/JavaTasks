public class TaskFour{
public static void main(String[] args){

    int numberOne = 2 ;
    int numberTwo = 5 ; 

    if (numberOne < numberTwo){
        int swap = numberTwo;
     numberTwo = numberOne;
     numberOne  = swap ;
    }

    int difference = numberOne - numberTwo;

    System.out.print("Difference : " +difference + "\n");
}   
}
