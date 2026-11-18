import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){

    
    Scanner imput = new Scanner(System.in);
    int sum=0;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter score;" 
            );
            int score = imput.nextInt();
                 if( score < 0 || score > 100 ) {
                  System.out.println("Invalid");
                  }
                  else 
                  
            sum = sum + score ;
            }
            System.out.println("The sum =" + sum);
    }
}
