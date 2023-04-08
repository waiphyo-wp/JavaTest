package OOP.AuthorVsBook;

public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Test Author", "test-author@gmail.com", 'F');

        Book book = new Book("Test Book", author, 50);

        System.out.println(book.toString());

        System.out.println(book.getAuthor().getName());

        System.out.println(book.getAuthorEmail());
    }
}