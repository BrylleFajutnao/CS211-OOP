public class GettingInputs{
    public static void main(String[] args) {
        // Get the console
        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        // Prompt the user to enter details
        String yearString = console.readLine("Enter Year (Integer): ");
        int year = Integer.parseInt(yearString);

        String genre = console.readLine("Enter Genre (String): ");
        String album = console.readLine("Enter Album (String): ");
        String title = console.readLine("Enter Title (String): ");
        String artist = console.readLine("Enter Artist (String): ");

        // Print the entered details
        System.out.println("\nEntered Details:");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
