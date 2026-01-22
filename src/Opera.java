public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Director musicAuthor, String librettoToText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoToText);
        this.choirSize = choirSize;
    }
}
