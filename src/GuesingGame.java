import java.util.Scanner;
public class GuesingGame {
    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in);
     /*   int inches = 0;
        double mmeters = 0;

        do {
            System.out.println("Enter a random number");
            int randomNumber = myNumber.nextInt();
            System.out.println(randomNumber);
            inches++;
            mmeters = randomNumber * 25.4;
            System.out.println(randomNumber + "  " + mmeters);

        }while (inches < 3);



     int inches = 0;
     double mmeters = 0;
      for (inches = 0; inches < 3; inches++) {
          System.out.println("Enter a random number");
          int randomNumber = myNumber.nextInt();
          System.out.println(randomNumber);

          mmeters = randomNumber * 25.4;
          System.out.println(randomNumber + "  " + mmeters); */



     int inches = 0;
     double mmeters = 0;
     while (inches < 3) {

         System.out.println("Enter a random number");
         int randomNumber = myNumber.nextInt();
         System.out.println(randomNumber);
         inches++;

         mmeters = randomNumber * 25.4;
         System.out.println(randomNumber + "  " + mmeters);


      }



    }


}
