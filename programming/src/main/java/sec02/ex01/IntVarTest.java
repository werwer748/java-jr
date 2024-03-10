package sec02.ex01;

public class IntVarTest {
    public static void main(String[] args) {
        byte b1 = 100;
        short s1 = 30000; // 서언 후 변수에 2byte를 할당

        int num1 = -1234567890; // 선언 후 변수에 4byte를 할당
        int num2 = 1_234_567_890;

        long num3 = 9223372036854775807L; // 선언 후 변수에 8byte를 할당
        long num4 = -9_223_372_036_854_775_808L;

        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
