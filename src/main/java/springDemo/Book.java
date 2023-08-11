package springDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Book implements  Library{

//    private  Genre genre;
//
//    public Book(Genre genre) {
//        this.genre = genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }

    public void read(){
        System.out.println("Quality Reading....");
    }

}
