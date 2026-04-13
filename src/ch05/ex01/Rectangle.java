package ch05.ex01;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea(){
        return width*height;
    }
    int getPerimeter(){
        return (width+height)*2;
    }
}
