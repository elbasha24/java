public class j9_switch {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {
            case 12:
            System.out.println("twelve");
            // fall through
                break;
            case 7:
            System.out.print("seven ");
            break;
            case 5:
            System.out.println("Bingo");
            default:
            System.out.println("Done");
                break;
        }
         String ns = "nasr";
        switch ("nasr") {
            case "Omar":
            System.out.println("Hello Omar");
                break;
            case "Ali":
            System.out.println("Hello Ali");
                break;
            case "Mona":
            System.out.println("Hello Mona");
            break;
            default:
            System.out.println("I don't know you!");
                break;
                

        }
    }


}
