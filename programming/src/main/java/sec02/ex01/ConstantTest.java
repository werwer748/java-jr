package sec02.ex01;

public class ConstantTest {
    public static void main(String[] args) {
        final int SAFE_SPEED = 60;
        final int MAX_VALUE = 2147483647;
        final int MIN_VALUE = -2147483647;
        final String SERVER_IP_ADDRESS = "13.124.56.189";

        System.out.println("규정 속도는 " + SAFE_SPEED + "km입니다.");

//        SAFE_SPEED = 70; // 중간에 값을 변겨할 수 없음

        System.out.println("정수의 최댓값: " + MAX_VALUE);
        System.out.println("정수의 최솟값: " + MIN_VALUE);
        System.out.println("서버 IP 주소는 " + SERVER_IP_ADDRESS + " 입니다.");
        System.out.println("원주율은 "+Math.PI + "입니다.");
    }
}
