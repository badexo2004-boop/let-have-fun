import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){

    
    Scanner imput = new Scanner(System.in);
    int sum=0;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter score;" 
            );
            int score = imput.nextInt();
                 if( score >= 0 && score <= 100 ) {
                     sum = sum + score ;
                       
            sum = sum + score ;
             }
                  else {
                  }
            }
            System.out.println("The sum =" + sum);
    }
}


