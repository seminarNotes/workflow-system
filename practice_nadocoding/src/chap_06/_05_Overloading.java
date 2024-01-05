package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 매소드 오버로딩
        // 이름이 같은 매소드를 여러 번 선언하는 것
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다를 때,

        System.out.println(getPower(3));        
        System.out.println(getPower("3"));

        System.out.println(getPower(3, 2));




    }
    
}
