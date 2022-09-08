package ru.mirea.lab1;
import java.lang.*;

public class Book {
    private int numberOfPages;
    private String title;

    public Book(){};

    public void setNumberOfPages(int n){
        numberOfPages = n;
    }

    public void setTitle(String name){
        title = name;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public String getTitle(){
        return title;
    }

    public void readBook(){
        System.out.print("Hello, i am Darya!");
    }
}
