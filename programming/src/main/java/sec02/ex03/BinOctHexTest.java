package sec02.ex03;

public class BinOctHexTest {
    public static void main(String[] args) {
        int num1 = 200;
        int bin = 0b11010011; // 2진수를 변수에 저장
        int oct = 0110; // 8진수를 변수에 저장
        int hex = 0x13FC;

        System.out.println("num1 = " + num1);
        System.out.println("bin = " + bin);
        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);
        System.out.println("num1 = " + Integer.toBinaryString(num1)); // 2진수로 출력
        System.out.println("bin = " + Integer.toOctalString(bin)); // 8진수로 출력
        System.out.println("hex = " + Integer.toHexString(oct)); // 16진수로 출력
    }
}
