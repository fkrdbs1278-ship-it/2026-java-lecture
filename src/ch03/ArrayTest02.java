package ch03;

public class ArrayTest02 {
    static void main() {
        String[] names = new String[3];
        names[0] = "전지현";
        names[1] = "송혜교";
        names[2] = "김태희";

        String [] actors = {"장동건","이병헌","송강호"};
        int [] nums = {10,303,27,98,102,121,21212,212,121,211,2,12,1,214,3,424324,32,435,435554};
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max =nums[i];
            }
        }
        System.out.println("제일 큰 숫자는"+max);
        for (String actor:actors){
            System.out.println(actor);
        }
        enum Week {월, 화, 수, 목, 금 ,토 ,일}; // enum 열거형 2
        //Week.values =[월,화,수,목,금,토,일}
        for(Week day: Week.values()){
            System.out.println(day);
        }

        int [][] intArray=new int[4][2];
        intArray[0][0] = 80;
        intArray[0][1] = 90;
        intArray[1][0] = 78;
        intArray[1][1] = 92;
        intArray[2][0] = 45;
        intArray[2][1] = 65;
        intArray[3][0] = 75;
        intArray[3][1] = 85;
        for (int i =0;i<4;i++){
            for (int j=0;j<2;j++){
                System.out.println((i+1)+"학년"+(j+1)+"학기 점수 : "+intArray[i][j]);
            }
        }
        double [][]doubleArray ={{3.7,4.2},{3.9,4.1},{4.25,4.17},{4.1,4.34}};
        for (int i = 0;i< doubleArray.length;i++){
            for (int j =0;j<doubleArray[i].length;j++){
                System.out.println((i+1)+"학년"+(j+1)+"학기 점수 : "+doubleArray[i][j]);
            }
        }
        for (double [] row : doubleArray){
            for (double value:row){
                System.out.print(value+"/");
            }
        }
    }
}
