public class j3 {
    public static void main(String[] args) {
        String ns = "nasr";
        System.out.println(ns.length() + "\n"); // 4
        System.out.println(ns.charAt(0));      // n
        System.out.println(ns.substring(2,3));   // r
        System.out.println(ns.toUpperCase());     // NASR
        System.out.println(ns.replace('s', 'S')); // NaSR
        System.out.println(ns.indexOf("a"));       // -1
        System.out.println(ns.lastIndexOf("a"));    // -1
        System.out.println(ns.contains("a"));       // false
        System.out.println(ns.startsWith("as"));    // false
        System.out.println(ns.endsWith("sr"));     // true
        System.out.println(ns.trim().equalsIgnoreCase("NASR"));// true
        System.out.println(ns.substring(0, 0));
        System.out.println(ns.substring(0, 2));
        System.out.println(ns.compareTo(ns.toLowerCase())); // 0
        System.out.println((ns == null)? "null" : "not null");
        System.out.println(ns.concat("khalil"));
        System.out.println(ns.equalsIgnoreCase(ns.toLowerCase())? "lowercase" : "uppercase");
        System.out.println(ns.isBlank());
        System.out.println(Character.getType('A')+ " is upper case letter."); // 1
        System.out.println(ns.isBlank());
        System.out.println(ns.isEmpty() ? "empty string" : "non-empty string");
        System.out.println(ns.lastIndexOf(ns.charAt(0))); // 0

        // System.out.println(Character.charCount("Hello")); // count characters in string
        System.out.println(Character.isDigit('5')); // check if character is digit
        System.out.println(Character.isLowerCase('h')); // lowercase letter
        System.out.println(Character.isUpperCase('H')); // upper case letter
        System.out.println(Character.isLetterOrDigit('5')); // al
        System.out.println(Character.isWhitespace('\n')); // whitespace
        System.out.println(String.valueOf(1234).substring(2)); // convert to String and substring
        
        System.out.println(new StringBuilder().append("Hello").reverse().toString()); // reverse a string
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<5; i++) {
            sb.append(i).append(", ");
        }

        System.out.println(Character.isDigit('5')); // false
        System.out.println(Character.getType('A')); // Uppercase Latin Letter (Lu)
        System.out.println(Integer.parseInt("123")); // 123

        char[] c = {'h','e','l','o'};
        System.out.println(new String(c));         // hello
        }
    }

