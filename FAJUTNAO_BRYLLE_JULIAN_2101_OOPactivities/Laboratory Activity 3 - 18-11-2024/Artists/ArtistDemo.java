public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Bruno Mars", 39, "Music");
        System.out.println(artist);

        Singer singer1 = new Singer("Eminem", 52, Singer.Genre.HIPHOP);
        System.out.println("\nSinger's Info:");
        System.out.println(singer1);

        Singer singer2 = new Singer("Louis Armstrong", 69, Singer.Genre.JAZZ);
        System.out.println("\nSinger's Info:");
        System.out.println(singer2);

        Painter painter1 = new Painter("Pablo Picasso", 91, Painter.Medium.OIL);
        System.out.println("\nPainter's Info:");
        System.out.println(painter1);

        Painter painter2 = new Painter("Robert Motherwell", 76, Painter.Medium.ACRYLIC);
        System.out.println("\nPainter's Info:");
        System.out.println(painter2);

        Writer writer1 = new Writer("Nagaru Tanigawa", 53, Writer.WritingStyle.FICTION);
        System.out.println("\nWriter's Info:");
        System.out.println(writer1);

        Writer writer2 = new Writer("Honobu Yonezawa", 46, Writer.WritingStyle.DRAMA);
        System.out.println("\nWriter's Info:");
        System.out.println(writer2);

        Dancer dancer1 = new Dancer("Misty Copeland", 41, Dancer.DanceStyle.BALLET);
        System.out.println("\nDancer's Info:");
        System.out.println(dancer1);

        Dancer dancer2 = new Dancer("Dushaunt Fik-Shun Stegall", 30, Dancer.DanceStyle.HIPHOP);
        System.out.println("\nDancer's Info:");
        System.out.println(dancer2);
    }
}
