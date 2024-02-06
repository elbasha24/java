public class j6_loops {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value at index " + i + ": " + arr[i]);

        }

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        int i2 = 1;
        // do {
        //     System.out.print(i2 + " ");
        //     i++;
        // } while (i2 <= 10);

    }
}
