package springDemo;

import org.springframework.stereotype.Component;


public class Genre {

    private String comedy;

//    //Constructor

    public Genre(String comedy) {
        this.comedy = comedy;
    }

    //getter and setter
    public String getComedy() {
        return comedy;
    }

    public void setComedy(String comedy) {
        this.comedy = comedy;
    }
//to String
    @Override
    public String toString() {
        return "Entertainment";
    }
}
