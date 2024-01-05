package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For 예제
        for (int i = 0; i < 10; i++){
            // ... 수행 명령 ...
            System.out.println("어서오세요. 나코입니다." + i);
        }

        // 짝수만 출력 예제
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + ",");
        }
        // >> 0, 2, 4, 6, 8

        // 홀수만 출력 예제
        System.out.println();
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + ",");
        }

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        System.out.println();
        for (int i = 5; i > 0; i -= 1) {
            System.out.print(i + ",");            
        }

        // 1부터 10까지의 수들의 합
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");

    }
    
}
