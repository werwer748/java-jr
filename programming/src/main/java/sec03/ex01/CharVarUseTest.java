package sec03.ex01;

public class CharVarUseTest {
    public static void main(String[] args) {
        int univNum = 0; // 전국에 대학수 - 정수 타입 변수
        char grade = 'A'; // 학점 저장 - 문자 타입 변수

        // 좋은 변수 사용법
        univNum = 235;
        grade = 'F';
        System.out.println("국내 대학수: " + univNum + ", 학점: " + grade);

        // 좋지 않은 변수 사용법
        univNum = grade + 210; // 정수 타입 변수에 문자를 저장하는 것은 좋지 않음
        grade = 97 - 32; // char 타입 변수에 점수를 저장하는 것은 좋은 사용법이 아니다.
        System.out.println("국내 대학수: " + univNum + ", 학점: " + grade);
    }
}
