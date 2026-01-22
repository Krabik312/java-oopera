public class MusicalShow extends Show {
    private Director musicAuthor;
    private String librettoToText;

    public MusicalShow(String title, int duration, Director director, Director musicAuthor, String librettoToText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoToText = librettoToText;
    }

    public void printLibretto() {
        System.out.println(this.librettoToText);
    }
}