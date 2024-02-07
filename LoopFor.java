public class LoopFor {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 12;
        for (int i = 0; i < x; i++) {
            System.out.println(i);

        }
        String ns = "Nasr henidaa Elzanaty khalil";
        String[] words = ns.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        String na = "Nasr";
        String[] nas = { "Nasr", "henidaa", "Elzanaty", "khalil" };

        for (String word : nas) {
            if (word.equals(na)) {
                System.out.println(na + " is in the array");
            }
        }
    }
}
