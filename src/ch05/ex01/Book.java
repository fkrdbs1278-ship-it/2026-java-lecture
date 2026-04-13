package ch05.ex01;

public class Book {
    String title;
    String author;
    int price;
    Book(){
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void showInfo(){
        System.out.println("제목:"+title+" 저자:"+author+" 가격:"+price);
    }

}
