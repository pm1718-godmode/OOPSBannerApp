/**
 * OOPS Banner App - UC4
 * Refactored to use String array and loop for modularity
 * Prints OOPS in a large banner
 */
public class OOPSBannerAppUC4 {
    public static void main(String[] args) {
        // Store each line of the banner in a String array
        String[] banner = {
            "  ***    ***   *****   ***** ",
            " *   *  *   *  *   *   *    *",
            " *   *  *   *  *   *   *    *",
            " *   *  *   *  *****    ***  ",
            "  ***    ***   *        *    *",
            "                    *   *    *",
            "                    *****    *** "
        };

        // Use a loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}