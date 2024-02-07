import java.util.Random;

public class j8_random {
    public static void main(String[] args) {
        Random random = new Random();

        // Random methods
        int num = random.nextInt(10); // Generates a random integer between 0 and 9
        System.out.println("Random number: " + num);

        double dnum = random.nextDouble(); // Generates a random double between 0 and 1
        System.out.println("Random decimal: " + dnum);
        System.out.println();

        // Generating random integers
        int randomNumber = random.nextInt();
        System.out.println("Random Integer: " + randomNumber);

        // Generating random doubles
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generating random booleans
        boolean randomBoolean = random.nextBoolean();
        
    }
}
