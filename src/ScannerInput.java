import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);


     int score = 0;
     int sum = 0;
        do {
            System.out.println("Enter the score");
        int myScore = keyboard.nextInt();
        System.out.println(myScore);

        score++;
            sum += myScore;

        } while (score < 2);


        System.out.println("Total sum " + sum);
        double average = sum / 2;
        System.out.println("Average score " + average);








    }







}
