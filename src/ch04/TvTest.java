package ch04;

public class TvTest {
    static void main() {
        Tv myTv = new Tv();
        myTv.brand="samsung";
        myTv.size=60;
        myTv.pixel = 30000000;
        myTv.turnOn();
        myTv.showInfo();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnDown();
        myTv.turnOff();

        Tv yourTv = new Tv();
        yourTv.brand = "LG";
        yourTv.size= 70;
        yourTv.pixel = 40000000;
        yourTv.showInfo();
    }
}
