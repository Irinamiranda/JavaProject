public class FizBuz {
    public static void main(String[] args) {
        for (int count = 1; count < 21; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz jopa");
            } else {
                System.out.println(count);
            }
        }
    }
}
