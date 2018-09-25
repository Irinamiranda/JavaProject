import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Integer, String> myNumbers = new HashMap<>();
//        myNumbers.put(1, "one");
//        myNumbers.put(2, "two");
//        myNumbers.put(3, "three");
        File file = new File("data/numbers.txt");
        Scanner scannerInput = new Scanner(file);
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            String[] nums = line.split(" ");
            myNumbers.put(Integer.parseInt(nums[0]), nums[1]);


            System.out.println(line);
        }


        System.out.println("Please input number:");
        int n = new Scanner(System.in).nextInt();
        if (myNumbers.containsKey(n)) {
            System.out.println("You entered " + myNumbers.get(n));
        }
        else {
            System.out.println("add you number to the Map");
        }



    }
}
