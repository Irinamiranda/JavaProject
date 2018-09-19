import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

  /*    int inches = 0;
        double mmsum = 0;

        for (inches = 1; inches < 16; inches++) {
                mmsum = inches * 25.4;
                System.out.println(inches + " " + mmsum);
            }




 int inches = 0;
double mmeters = 0;
 do {

     mmeters = inches * 25.4;
     System.out.println(inches + "  " + mmeters);
     inches += 1;

 } while (inches < 16);

*/



int inches = 0;
double mmeters = 0;
while (inches < 15){
    inches += 1;
    mmeters = inches * 25.4;
    System.out.println(inches + " " + mmeters);
}


    }
}
