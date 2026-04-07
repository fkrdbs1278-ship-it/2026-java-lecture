public class TypeTest {
    static void main() {
        //자바에서 타입은 기본 타입 8개
        //참조타입
        boolean isBool = true; //true, false 만 사용가능 *
        char ch = 'a'; //작은 따옴표로 문자 하나만 표시 이때 문자는 전부 정수로 변환 가능하다.
        byte b = 10; //-128 ~ 127 까지 사용가능 1byte 8bit
        short sh = 10000; // 2의 16승 까지 사용가능
        int num = 1111111111; // 2의 32승 *
        long long_num = 111111111L; // L을 붙여야 LONG으로 인식
        float num_float=0.2f; // f을 붙여야 float으로 인식
        double num_double=0.2; //*
        System.out.println(isBool);
        char ch02 = 65; //65 - 'A', 66 - 'B'
        char ch03 = '金'; //65 - 'A', 66 - 'B'
        System.out.println((int)ch03); //형변환 (type casting)
        String str = "김영준";
        String strNull = null; // 아무것도 할당하지않을때 null,
        // 리터럴은 프로그래밍에서 사용하는 재료 주로 숫자 문자등 하나의 값으로 인시된다.

        int age =30;
        age = 31;
        final double PI = 3.14;
        System.out.println(PI);

        //type casting 형변환
        int num04 = 10;
        System.out.println(num04*3.14);
        System.out.println(314/(double)10);
        System.out.println((int)2.9); //작은 타입은 큰 타입에 대입가능하다. 이떄 아무런 영향을 받지 않는다.
        byte b02 = (byte)num04;
        // 큰 타입을 작은 타입에 넣을때 반드시 형병환이 필요하다. 이때 값의 손실이 일어난다.
        System.out.println(b02);
    }
}
