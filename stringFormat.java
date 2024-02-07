public class stringFormat {

    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double salary = 5000.50;

        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(formattedString);
    }
}

/*
 *
 *
 * %s: String
 * %d: Integer
 * %f: Floating-point number
 * %.nf: Floating-point number with n decimal places
 * %t: Date/time
 * %b: Boolean
 * %c: Character
 */
