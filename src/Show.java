import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printAllActors() {
        for(Actor actor : this.listOfActors) {
            System.out.println(actor.toString());
        }

    }

    public boolean isSameActor(Actor newActor) {
        if (this.listOfActors == null) {
            return false;
        } else {
            for(Actor actor : this.listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println("Такой актер уже есть в этом спектакле");
                    return true;
                }
            }

            return false;
        }
    }

    public void addActor(Actor newActor) {
        if (!this.isSameActor(newActor)) {
            this.listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor newActor, String replacedActorSurname) {
        if (!this.isSameActor(newActor)) {
            for(Actor actor : this.listOfActors) {
                if (actor.getSurname().equals(replacedActorSurname)) {
                    this.listOfActors.remove(actor);
                    this.listOfActors.add(newActor);
                    return;
                }
            }

            System.out.println("Актера с такой фамилией нет");
        }
    }
}
