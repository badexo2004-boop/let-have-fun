import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){

    
    Scanner imput = new Scanner(System.in);
    int sumEven=0;
  
  for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter score;");
            int score = imput.nextInt();
            if( score %2 ==0){
             
            sumEven = sumEven + score;
            }
            }
            double average = (double) sumEven / 10 ;
            System.out.println("the average of even =" + average );
    }
}
