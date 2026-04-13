package ch05.ex01;

public class BookTest {
    static void main() {
        Book book01 = new Book();
        book01.title="백설공주";
        book01.author ="공주";
        book01.price = 10000;
        book01.showInfo();
        Book book02 = new Book("백범 김구","김구");
        book02.price = 12000;
        book02.showInfo();
        Book book03 = new Book("인어공주","인어",15000);
        book03.showInfo();

    }
}
