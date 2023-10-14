package ui.text;
import org.example.domain.book.BookService;

import java.io.IOException;
import java.util.Scanner;
public class TextMainView {

    private BookService bookService;

    public TextMainView(BookService bs){
        this.bookService = bs;
    }
    public void init() throws IOException {

        System.out.println("Books - System do zarzadzania zbiorami biblotecznymi");
        this.bookService.readAll();
        System.out.println("Wybierz operacje:");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while(option != 0){
            System.out.println("1. Dodaj nowa ksiazke");
            System.out.println("0. Wyjdz z systemu");
            option = Integer.parseInt(scanner.nextLine()); //Lepiej pobrac linie i przeparsowac do Int

            if(option == 1){
                this.handleCreateNewBook(scanner);
            }
            else if (option == 0){
                System.out.println("Zapisuje dane");
                this.bookService.saveAll();
                System.out.println("Koncze dzialanie programu");
            }
        }
    }

    private void handleCreateNewBook(Scanner scanner){
        System.out.println("Podaj tytul ksiazki: ");
        String title = scanner.nextLine();
        this.bookService.createNewBook(title);
    }
}
