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
}
