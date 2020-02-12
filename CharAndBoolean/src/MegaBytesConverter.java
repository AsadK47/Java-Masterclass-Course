public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytesAsAKiloByte = 1024;
        int megaBytes = kiloBytes / megaBytesAsAKiloByte;
        int remainingKiloBytes = kiloBytes % megaBytesAsAKiloByte;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
