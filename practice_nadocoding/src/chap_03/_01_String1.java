package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29
        
        // 대문자 변환
        System.out.println(s.toUpperCase());

        // 소문자 변환
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보(첫글자 index)
        System.out.println(s.indexOf("C#")); // 위치 정보(첫글자 index), 존재하지 않을 경우 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 특정 문자열로 시작하는지 여부
        System.out.println(s.endsWith(".")); // 특정 문자열로 끝나는지 여부
        

        


        



    }
    
}
