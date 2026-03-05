public class BannerApp {
    public static void main(String[] args) {
        // Storing banner lines in a String array for modularity
        String[] bannerLines = {
            "*********************************",
            "* *",
            "* WELCOME TO THE SYSTEM      *",
            "* VERSION 4.0           *",
            "* *",
            "*********************************"
        };

        // Using an enhanced for-loop for cleaner output traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}