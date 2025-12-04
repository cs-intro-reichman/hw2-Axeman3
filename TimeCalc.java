public class TimeCalc {
    public static void main(String[] args) {
        String[] parts = args[0].split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int minutesToAdd = Integer.parseInt(args[1]);

        int total = hh * 60 + mm + minutesToAdd;
        total = ((total % (24 * 60)) + (24 * 60)) % (24 * 60); // בטוח גם אם יהיה שלילי

        int newH = total / 60;
        int newM = total % 60;

        System.out.printf("%02d:%02d%n", newH, newM);
    }
}
