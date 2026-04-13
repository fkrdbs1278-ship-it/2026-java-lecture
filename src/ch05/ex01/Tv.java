package ch05.ex01;

public class Tv {
    String brand;
    int size;
    int volume;

    void showInfo(){
        System.out.println("브랜드:"+brand+" 사이즈:"+size+" 볼륨:"+volume);
    }

    void turnOn(){
        System.out.println("TV 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("TV 전원을 끕니다.");
    }
    void volumeUp(){
        if (volume<100){
            volume++;
            System.out.println("볼륨:"+volume);
        }
    }
    void  volumeDown(){
        if (volume>0){
            volume--;
            System.out.println("볼륨:"+volume);
        }
    }

}
