public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int kiloByteInMegaBytes = 1024;

        int convertedInMegaBytes = kiloBytes / kiloByteInMegaBytes;
        int remaining = kiloBytes % kiloByteInMegaBytes;

        System.out.println(kiloBytes + " KB = " + convertedInMegaBytes
                + " MB and "+ remaining + " KB");
    }
}
