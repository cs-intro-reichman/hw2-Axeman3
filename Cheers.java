//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String text = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);

        final String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean useAn = anLetters.indexOf(ch) >= 0;
            System.out.println("Give me " + (useAn ? "an " : "a ") + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(text + "!!!");
        }
        }
}
