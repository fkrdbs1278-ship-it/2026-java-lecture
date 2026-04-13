package ch05.inherit;

public class ColorPoint extends Point{
    String color;
    void setColor(String color){
        this.color = color;
    }
    void showColorPoint(){
        System.out.print("color : "+color+",");
        showPoint();
    }
}
