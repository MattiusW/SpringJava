package org.example;
import org.example.domain.book.Book;
import org.example.domain.book.BookRepository;
import org.example.domain.book.BookService;
import ui.text.TextMainView;
import java.io.IOException;

public class App {

    public static void main( String[] args ) throws IOException {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        TextMainView view = new TextMainView(bookService);
        view.init();
    }
}
