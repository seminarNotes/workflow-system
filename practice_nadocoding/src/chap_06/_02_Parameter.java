package chap_06;

public class _02_Parameter {
    public static void power(int number) { // Paramter, 매개변수
        int result = number * number;
        System.out.println(number + "의 제곱은 " + result + "입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "제곱은 " + result + "입니다.");

    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 X 2 = 4
        power(2);
        
        // 3 -> 3 X 3 = 9
        power(3);

        powerByExp(2, 3);
        powerByExp(4, 3);
        powerByExp(10, 0);






    }
    
}
