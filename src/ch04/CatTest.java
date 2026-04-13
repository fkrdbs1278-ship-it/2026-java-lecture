package ch04;

public class CatTest {
    static void main() {
        Cat cat01 = new Cat(); //object, 인스턴스
        cat01.name="러블릴";
        cat01.age=3;
        Cat cat02 = new Cat();
        cat02.name="야옹이";
        cat02.age=4;

        Cat cat03 = cat01;

        Cat[] cats = new Cat[2];
        cats[0]= cat01;
        cats[1]= cat02;
        for (int i=0;i< cats.length;i++){
            System.out.println(cats[i].name);
            System.out.println(cats[i].age);
        }

    }
}
