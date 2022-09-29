public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jules Gabriel", "Verne");
        Book book = new Book("Vingt mille lieues sous les mers", "1844", author);
        book.setBookAge("1869");
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и миръ", "1865", author1);
        System.out.println(book.getBookName());
        System.out.println(book.getBookAge());
        System.out.println(author.getFirstName() + " " + author.getLastName());
        System.out.println();
        System.out.println(book1.getBookName());
        System.out.println(book1.getBookAge());
        System.out.println(author1.getFirstName() + " " + author1.getLastName());
    }
}