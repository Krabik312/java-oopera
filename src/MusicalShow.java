public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoToText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoToText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoToText = librettoToText;
    }

    public void printLibretto() {
        System.out.println(this.librettoToText);
    }
}