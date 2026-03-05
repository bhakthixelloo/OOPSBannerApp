/**
 * UC3: Use String Join for Memory Management
 * Optimizing banner construction to improve internal efficiency.
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String delimiter = "   "; // Use 3 spaces between letters

        // Constructing each of the 7 lines of the "OOPS" banner
        String line1 = String.join(delimiter, "****", "****", "****", "****");
        String line2 = String.join(delimiter, "* *", "* *", "* *", "* ");
        String line3 = String.join(delimiter, "* *", "* *", "* *", "* ");
        String line4 = String.join(delimiter, "* *", "* *", "****", "****");
        String line5 = String.join(delimiter, "* *", "* *", "* ", "   *");
        String line6 = String.join(delimiter, "* *", "* *", "* ", "   *");
        String line7 = String.join(delimiter, "****", "****", "* ", "****");

        // Printing the final banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}