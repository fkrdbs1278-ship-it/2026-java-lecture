public class OperatorTest {
    static void main() {
        int time = 5000;
        int second = time%60;
        int minute = time / 60 % 60;
        int hour = time / 60 / 60;
        System.out.println(time +"초는 "+hour+"시간"+minute+"분 "+second+"초 입니다.");
//        System.out.println(time/3600);
//        System.out.println(time%3600/60);
//        System.out.println(time/60%60);
//        System.out.println(time%60);

        //산술 연산 +,-,*,/,%
//        System.out.println(10+10);
//        System.out.println(10-5);
//        System.out.println(10*5);
//        System.out.println(10/5);
//        System.out.println(10%5);
        int a = 1;
        int b = 1;
        a = a + 1;
        a += 1;
        a++;
        int c = a++; // ++은 후위 증감 연산자 먼저 할당하고 나중에 연산
        // c = 4, a = 5
//        int c = ++a; // ++은 선위 증감 연산자 먼저 할당하고 나중에 연산
        // c = 5, a = 5
        System.out.println(c+"==="+a);
        //비교 연산
        int d = 5;
        int e = 3;
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e);
        System.out.println(d <= e);
        System.out.println(d == e);
        System.out.println(d != e);

        //논리 연산
        System.out.println(!(5 > 3)); // !는 부정 연산
        System.out.println(!true);
        System.out.println(5 > 3 || 4 > 5); // or 연산 하나라도 참이면 참
        System.out.println(5 > 3 && 4 > 5); // and 연산 둘다 참이여야 참
        System.out.println(5 > 3 ^ 4 > 5); // xor 연산 같으면 거짓 다르면 참

        String userID = "kim04";
        String userPW = "1234";
        if (userID.equals("kim04") || userPW.equals("1234")){
            System.out.println("로그인 성공");
        }



    }
}
