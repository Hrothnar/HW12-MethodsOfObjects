public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jules Gabriel", "Verne");
        Book book = new Book("Vingt mille lieues sous les mers", "1844", author);
        book.setBookAge("1869");
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и миръ", "1865", author1);
        System.out.println(book + "\n");
        System.out.println(book1);
        System.out.println();
        System.out.println("Итог сравнения имён авторов: " + author.equals(author1));
        System.out.println("Итог сравнения названия книг: " + book.equals(book1));
        System.out.println();
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}