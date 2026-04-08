package ch02.Answer01;

public class Answer07 {
    static void main() {
        int num = 4;
        String season = null;
        if (num == 3 || num == 4 || num == 5) {
            season = "봄";
        } else if (num == 6 || num == 7 || num == 8) {
            season = "여름";
        } else if (num == 9 || num == 10 || num == 11) {
            season = "가을";
        } else {
            season = "겨울";
        }
        System.out.println(num + "월은 " + season + "입니다.");
    }
}
