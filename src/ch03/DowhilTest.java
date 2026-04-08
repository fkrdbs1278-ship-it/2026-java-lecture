package ch03;

public class DowhilTest {
    static void main() {
        int i = 100;
        do{
            System.out.println(i);
            i++;
        } while (i<10);

        char ch='a';
        do {
            System.out.print(ch);
            ch=(char)(ch+1);
        }while (ch<='z');
    }
}
