import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Person person = (Person)o;
            return Objects.equals(this.name, person.name) && Objects.equals(this.surname, person.surname);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.surname});
    }

    public String toString() {
        return this.name + this.surname;
    }
}
