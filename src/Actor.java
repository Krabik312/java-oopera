import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            if (!super.equals(o)) {
                return false;
            } else {
                Actor actor = (Actor)o;
                return this.height == actor.height;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{super.hashCode(), this.height});
    }

    public String toString() {
        String var10000 = this.getName();
        return var10000 + " " + this.getSurname() + " (" + this.height + ") ";
    }
}
