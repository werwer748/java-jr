package sec01.ex01;

public class VarInitTest1 {
    public static void main(String[] args) {
        int num; // 변수 선언
//        System.out.println("num = " + num); // 초기화되지 않아서 에러
        num = 12; // 12로 초기화

        int num2 = 30; // 선언과 동시에 초기화
//        num = 12.5; // int를 선언했는데 double 타입을 대입해서 에러

        System.out.println("num = " + num);

        num = 20;
        System.out.println("num = " + num);
    }
}