// Demonstrates the Collatz conjecture.
public class Collatz {
	   private static long next(long x) {
        if (x % 2 == 0) return x / 2;
        return 3 * x + 1;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            long x = seed;
            int count = 0;
            boolean startedAtOne = (x == 1);

            if (verbose) {
                while (true) {
                    System.out.print(x + ( (startedAtOne && x == 1 && count > 0) ? "" : " "));
                    count++;
                    if ((!startedAtOne && x == 1) || (startedAtOne && x == 1 && count > 1)) {
                        System.out.println("(" + count + ")");
                        break;
                    }
                    x = next(x);
                }
            } else {
                while (true) {
                    count++;
                    if ((!startedAtOne && x == 1) || (startedAtOne && x == 1 && count > 1)) {
                        break;
                    }
                    x = next(x);
                }
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

