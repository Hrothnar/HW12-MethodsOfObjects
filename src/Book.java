import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAge;
    private Author authorName;

    public Book(String bookName, String age, Author authorName) {
        this.bookName = bookName;
        this.bookAge = age;
        this.authorName = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getBookAge() {
        return this.bookAge;
    }

    public void setBookAge(String bookAge) {
        this.bookAge = bookAge;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
        return "Имя автора: " + authorName + "\nНазвание книги: " + bookName + "   " + "\nГод первой публикации: " + bookAge;
    }

    @Override
    public boolean equals(Object that) {
        if (this.bookName == null) {
            if (this.getClass() != that.getClass()) {
                return false;
            }
        }
        Book anotherBook = (Book) that;
        return this.bookName.equals(anotherBook.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName + authorName + bookName);
    }
}
