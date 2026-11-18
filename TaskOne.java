import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){

    
    Scanner imput = new Scanner(System.in);
    int sum=0;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter score;" 
            );
            int score = imput.nextInt();
            sum= sum + score ;
            }
            System.out.println("The sum =" + sum);
    }
}
