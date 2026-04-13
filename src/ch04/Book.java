package ch04;

public class Book {
    String bookname;
    String name;
    // this는 class 자신을 가리킨다.
    // 주로 멤버 변수에 접근할때 쓴다.
    // 생략이 가능하다.
    Book(){
        this("제목없음","작자미상");

    }
    Book(String bookname){
//        this.bookname = bookname;
//        name = "작자미상";
//        this(bookname, "작자미상");

        System.out.println("책 제목: "+bookname);
    }
    Book(String _bookname, String _name){
        bookname = _bookname;
        name = _name;
        System.out.println("책 제목 : "+_bookname);
        System.out.println("작가 : "+_name);
    }
    void showInfo(){
        System.out.println("작가는"+name+", 책 제목은 "+bookname);
    }
}
