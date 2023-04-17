package SingletonObject;

import java.util.Arrays;
import java.util.Scanner;

public class SingletonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookAdder adder = new BookAdder(scanner);

        BookViewer viewer = new BookViewer();
        
        System.out.println("Add Book");
        adder.add();

        System.out.println("All Books");
        viewer.show();
    }
}


class BookAdder {
    private BookStore store;
    private Scanner scanner;

    String endLoop = null;

    public BookAdder(Scanner scanner) {
        this.store = BookStore.STORE;
        this.scanner = scanner;
    }

    public void add() {

        do {
            System.out.println("Book Name : ");
            String book = scanner.nextLine();
            store.add(book);
            System.out.println("Add More Books . Enter(Y/N)");
            endLoop = scanner.nextLine();
            
        } while ("Y".equalsIgnoreCase(endLoop));
    }
}

enum BookStore {

    // use enum constant to create singleton object
    STORE;

    private String [] books = {};

    // create singleton object
    // 2 private static BookStore store;

    // 3 public static BookStore getInstance() {

    //     if (null == store) {
    //         store = new BookStore();
    //     }

    //     return store;
    // }

    // 1 private BookStore() {

    // }

    public void add(String str) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = str;
    }

    public String [] getAll() {
        return books;
    }

}

class BookViewer {
    private BookStore store;

    public BookViewer() {
        this.store = BookStore.STORE;
    }

    public void show() {
        for (String book : store.getAll()) {
            System.out.println(book);
        }
    }
}