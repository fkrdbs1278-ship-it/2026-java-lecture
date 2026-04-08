package ch02.Answer01;

public class Answer0701 {
    static void main() {
        int num = 4;
        String season = null;
        season = switch (num) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8, 9 -> "여름";
            case 10, 11 -> "가을";
            default -> "겨울";
        };
        System.out.println(season);
    }
}
