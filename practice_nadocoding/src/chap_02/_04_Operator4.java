package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자 
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true이면 true (최고의 식당)

        // and 연산
        System.out.println( (5 > 3) && (3 > 1) ); // 5는 3보다 크고, 3은 1보다 크다.
        System.out.println( (5 > 3) && (3 < 1) ); // 5는 3보다 크고, 3은 1보다 작다.

        // or 연산
        System.out.println( (5 > 3) || (3 > 1) ); // 5는 3보다 크거나 3은 1보다 크다.
        System.out.println( (5 > 3) || (3 < 1) ); // 5는 3보다 크거나 3은 1보다 작다.
        System.out.println( (5 < 3) && (3 < 1) ); // 5는 3보다 작거나 3은 1보다 작다.

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
        
    }
}
