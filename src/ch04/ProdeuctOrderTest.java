package ch04;

public class ProdeuctOrderTest {
    static void main() {
        ProdeuctOrder order01 = new ProdeuctOrder();
        order01.productName="가방";
        order01.price=100_000;
        order01.quantity=1_000;

        ProdeuctOrder order02 = new ProdeuctOrder();
        order02.productName="신발";
        order02.price=80_000;
        order02.quantity=500;

        ProdeuctOrder order03 = new ProdeuctOrder();
        order03.productName="바지";
        order03.price=30_000;
        order03.quantity=2_000;

        ProdeuctOrder order04 = new ProdeuctOrder();
        order04.productName="상의";
        order04.price=10_000;
        order04.quantity=3_000;

        ProdeuctOrder order05 = new ProdeuctOrder();
        order05.productName="모자";
        order05.price=5_000;
        order05.quantity=1_000;

        ProdeuctOrder[] Pro = new ProdeuctOrder[5];
        Pro[0]= order01;
        Pro[1]= order02;
        Pro[2]= order03;
        Pro[3]= order04;
        Pro[4]= order05;
        for (int i=0;i<Pro.length;i++){
            System.out.println("상품명: "+Pro[i].productName);
            System.out.println("가격: "+Pro[i].price+"원");
            System.out.println("주문수량: "+Pro[i].quantity+"개");
        }
        int sum01=(order01.price*order01.quantity);
        System.out.println("가방 총 가격: "+sum01+"원");
        int sum02=(order02.price*order02.quantity);
        System.out.println("신발 총 가격: "+sum02+"원");
        int sum03=(order03.price*order03.quantity);
        System.out.println("바지 총 가격: "+sum03+"원");
        int sum04=(order04.price*order04.quantity);
        System.out.println("상의 총 가격: "+sum04+"원");
        int sum05=(order05.price*order05.quantity);
        System.out.println("모자 총 가격: "+sum05+"원");
        int total=(sum01+sum02+sum03+sum04+sum05);
        System.out.println("전체 금액은: "+total+"원");

    }
}
