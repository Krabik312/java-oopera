public class Ballet extends MusicalShow {
    private Director choreographer;

    public Ballet(String title, int duration, Director director, Director musicAuthor, String librettoToText, Director choreographer) {
        super(title, duration, director, musicAuthor, librettoToText);
        this.choreographer = choreographer;
    }
}