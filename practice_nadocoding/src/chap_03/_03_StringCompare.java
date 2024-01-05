package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); // 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 X

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 정보 (참조)
        s2 = "1234"; // 실제 정보
        System.out.println(s1.equals(s2)); // true (내용이 같다)
        System.out.println(s1 == s2); // true (메모리가 같다)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
    
}
