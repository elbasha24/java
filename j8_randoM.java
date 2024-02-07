import java.util.Random;
public class j8_randoM {
    public static void main(String[] args) {
        Random random = new Random();

        // Generating random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generating random doubles
        random.doubles().limit(5).forEach(System.out::println);

        // Generating random integers
        random.ints().limit(5).forEach(System.out::println);

        // Generating random longs
        random.longs().limit(3).forEach(System.out::println);

        // Generating random integers between 'a' and 'z'
        random.ints('a', 'z').limit(5).forEach(System.out::println);

        // Generating random distinct integers between 5 and 7
        random.ints(5, 7).distinct().limit(2).forEach(System.out::println);

        // Generating random integers between 5 and 7 (inclusive)
        random.ints(5, 8).limit(4).forEach(System.out::println);

        // Generating random element from a list of choices
        System.out.println(random.nextBoolean() ? "Hello" : "World");

        // Generating random choice from an array of choices
        System.out.println(random.nextBoolean() ? "Hello" : "World");

        // Generating random weighted choice
        System.out.println(random.nextBoolean() ? "Hello" : "World");

        // Generating multiple random choices from a list of choices
        random.ints(0, 2).mapToObj(i -> i == 0 ? "Hello" : "World").limit(3).forEach(System.out::println);

        // Generating random element from an array of choices
        System.out.println(random.nextBoolean() ? "Hello" : "World");

        // Generating random integer within a range
        System.out.println(random.nextInt(10) + 5);

        // Generating random integer within a closed range
        System.out.println(random.nextInt(6) + 5);

        // Generating random boolean
        System.out.println(random.nextBoolean() ? "True" : "False");

        // Generating random double between 0.0 and 1.0
        System.out.println(random.nextDouble());

        // Generating random float between 0.0 and 1.0
        System.out.println((float) random.nextFloat());

        // Generating random hexadecimal number
        System.out.println(String.format("%08x", random.nextInt()));

        // Generating random long
        System.out.println(random.nextLong());

        // Generating random Gaussian number
        System.out.println(random.nextGaussian());

        // Generating random integer between 0 and 4
        System.out.println(random.nextInt(5) + ", " + random.nextInt(5));

        // Generating random long between 0 and 4
        // System.out.println(random.nextLong(5) + ", " + random.nextLong(5));

        // Generating random float between 0.0 and 1.0
        System.out.println(random.nextFloat());

        // Printing the string representation of the random object
        System.out.println(random.toString());
    }
}


