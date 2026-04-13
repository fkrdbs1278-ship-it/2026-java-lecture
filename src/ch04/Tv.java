package ch04;

public class Tv {
    int size;
    int pixel;
    String brand;
    int voulumn;
    //function 정의
    // 메서드(method)
    void volumnUp(){
        if (voulumn < 50){
            voulumn = voulumn+10;
        }
        System.out.println("현재 볼륨은 "+voulumn+"입니다.");
    }

    void volumnDown() {
        if (voulumn > 0){
            voulumn = voulumn - 10;
        }
        System.out.println("현재 볼륨은 " + voulumn + "입니다.");
    }

    void turnOn() {
        System.out.println("전원 들어옵니다.");
    }
    void showInfo(){
        System.out.println("나의 tv 브랜드는"+brand+" size는 "+size+" 화소는 "+pixel);
    }
    void turnOff(){
        System.out.println("전원이 꺼집니다,");
    }
}
