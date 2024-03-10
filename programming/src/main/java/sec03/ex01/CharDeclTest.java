package sec03.ex01;

public class CharDeclTest {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '가';
//        char ch3 = 'ab'; // 문자열 변수는 한개의 문자만 저장한다.
//        char ch4 = "a"; // 문자형 변수에 문자열을 대입하면 에러 발생

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println();

        System.out.println(ch1 + "의 유니코드 = " + (int)ch1);
        System.out.println(ch2 + "의 유니코드 = " + (int)ch2);
    }
}
