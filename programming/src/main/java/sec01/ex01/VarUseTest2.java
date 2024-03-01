package sec01.ex01;

public class VarUseTest2 {
    public static void main(String[] args) {
        int num;
        num = 12;
        System.out.println("num = " + num);
        num = num + 30; // num에 num + 30 을 한 값을 다시 저장
        System.out.println("num = " + num);
    }
}
