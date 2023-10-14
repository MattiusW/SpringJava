package org.example.domain.book;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import com.google.gson.Gson;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    Book createNewBook(String title){
        Random r = new Random();
        Book newOne = new Book(r.nextInt(), title);
        this.books.add(newOne);
        System.out.println("Utworzylem nowa ksiazke o tytule: " + newOne.getTitle());
        return newOne;
    }

    void readAll(){

    }

    void saveAll() throws IOException {
        Gson gson = new Gson(); //Reload Maven
        FileWriter fw = new FileWriter("./books.json");
        gson.toJson(this.books, fw);
        fw.flush();
        fw.close();
    }
}
