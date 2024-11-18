public class Singer extends Artist {
    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }
}