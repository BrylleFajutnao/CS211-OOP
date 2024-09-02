public class GettingInputs{
    public static void main(String[] args) {
        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String yearString = console.readLine("Enter Year: ");
        int year = Integer.parseInt(yearString);

        String genre = console.readLine("\nEnter Genre: ");
        String album = console.readLine("\nEnter Album: ");
        String title = console.readLine("\nEnter Title: ");
        String artist = console.readLine("\nEnter Artist: ");

        System.out.println("\n-------------------");
        System.out.println("\nSONG DETAILS");
        System.out.println("\n-------------------:");
        System.out.println("\nYear Released: " + year);
        System.out.println("\nGenre: " + genre);
        System.out.println("\nAlbum: " + album);
        System.out.println("\nTitle: " + title);
        System.out.println("\nArtist: " + artist);
    }
}
