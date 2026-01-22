public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoToText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoToText);
        this.choreographer = choreographer;
    }
}