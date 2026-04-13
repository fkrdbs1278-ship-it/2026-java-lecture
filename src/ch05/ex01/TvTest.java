package ch05.ex01;

public class TvTest {
    static void main() {
        Tv tv01 = new Tv();
        tv01.brand = "삼성";
        tv01.size = 75;
        tv01.volume = 10;
        tv01.showInfo();
        tv01.turnOn();
        tv01.volumeUp();
        tv01.volumeUp();
        tv01.volumeUp();
        tv01.volumeUp();
        tv01.volumeUp();
        tv01.volumeDown();
        tv01.volumeDown();
        tv01.volumeDown();
        tv01.turnOff();
    }
}
