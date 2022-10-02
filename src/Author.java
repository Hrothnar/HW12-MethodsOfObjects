import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    @Override
    public boolean equals (Object that) {
        if (this.firstName == null || this.lastName == null) {
            if (this.getClass() != that.getClass()) {
                return false;
            }
        }
        Author anotherAuthor = (Author) that;
        return this.firstName.equals(anotherAuthor.firstName) && this.lastName.equals(anotherAuthor.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName + lastName);
    }
}
