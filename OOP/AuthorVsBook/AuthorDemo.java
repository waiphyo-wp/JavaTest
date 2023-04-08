package OOP.AuthorVsBook;

public class AuthorDemo {
    public static void main(String[] args) {
        Author author = new Author("John Tesler", "johntesler@gmail.com", 'm');

        System.out.println(author.getEmail());
        author.setEmail("johnteslermale");
        System.out.println(author.toString());


    }
}
