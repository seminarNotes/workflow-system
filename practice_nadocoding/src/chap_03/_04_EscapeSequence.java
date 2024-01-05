package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자
        // Escape Sequence, Escape Character, Special Character
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재미있어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요.");

        // \t : 탭
        System.out.println("해물파전\t9,000원");
        System.out.println("김치전\t\t8,000원");
        System.out.println("부추전\t\t8,000원");

        // \\ : 역 슬래시(Escape Character)
        System.out.println("C:\\Program Files\\Java\\"); // 파일 경로 

        // 고양이가 "야옹"이라고 했어요.
        System.out.println("고양이가 \"야옹\"이라고 했어요."); // 큰 따옴표 사용
        System.out.println("고양이가 '야옹'이라고 했어요."); // 작은 따옴표 사용
        System.out.println("고양이가 \'야옹\'이라고 했어요."); // 작은 따옴표 사용


    }
    
}
