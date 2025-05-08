
public class HelloGoodbyeWorld {

    public static void main(String[] args) {
        System.out.print("Hello");
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                System.out.print(" " + args[i] + ".\n");
            } else {
                System.out.print(" " + args[i] + " and");
            }
        }

        System.out.print("Goodbye");
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                System.out.print(" " + args[i] + ".\n");
            } else {
                System.out.print(" " + args[i] + " and");
            }
        }
    }

}
