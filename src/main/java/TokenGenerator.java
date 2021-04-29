import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter searched case value");
        int myRandom = TokenGenerator.getRandom(scanner.nextInt());


            switch (myRandom){
                case(5) :
                    System.out.println(generateToken(5));
                    break;

                case (10):
                    System.out.println(generateToken(10));
                    break;

                case (15):
                    System.out.println(generateToken(15));
                    break;
                default:
                    System.out.println("incorrect parameter value");
            }




    }

    public static String generateToken(int input) {
        String token ="";

        final char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%&()^*abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        for (int i = 0; i < input; i++) {
            token += chars[random.nextInt(chars.length)];
        }
        return token;
    }

    public static  int getRandom(int rand){
        return rand;
    }
}
