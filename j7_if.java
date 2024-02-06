public class j7_if {

    /**
     * @param args
     */
    public static void main(String[] args) {
        var s = "Nasr";
        if (s.equals("Nasr")) {
            System.out.println(s + " is equal to Nasr");
        } else if (s.length() > 5) {
            System.out.println(s + " has more than 5 characters.");
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ": " + s.charAt(i));
        }
    }


}

/*
 *
 *
 *
 *
loop string
4.3. Loops and Strings — AP CSAwesome
Favicon for runestone.academy
runestone.academy
Loops and Strings | Think Java | Trinket
Favicon for trinket.io
books.trinket.io
Python For Looping Through a String
Favicon for w3schools.com
w3schools.com
D-Loops & String Loop Material – Lancaster Archery Supply
Favicon for lancasterarchery.com
lancasterarchery.com
Loop Through a String · CodeCraft - JavaScript
Favicon for gitbooks.io
buzzcoder.gitbooks.io
String Loop – Scott Archery
Favicon for scottarchery.com
scottarchery.com
To loop through a string in Java, you can use various approaches. Here are a few common methods:


Using a for loop:

String str = "Hello, World!";
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    System.out.print(c + " ");
}
Output: H e l l o , W o r l d !

Using a for-each loop:

String str = "Hello, World!";
for (char c : str.toCharArray()) {
    System.out.print(c + " ");
}
Output: H e l l o , W o r l d !

Using a while loop with an index:

String str = "Hello, World!";
int i = 0;
while (i < str.length()) {
    char c = str.charAt(i);
    System.out.print(c + " ");
    i++;
}
Output: H e l l o , W o r l d !

Using a while loop with a StringCharacterIterator:

String str = "Hello, World!";
StringCharacterIterator iterator = new StringCharacterIterator(str);
while (iterator.hasNext()) {
    char c = iterator.next();
    System.out.print(c + " ");
}
Output: H e l l o , W o r l d !


*/
