package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값을 여러 개 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coeffChandler = "라떼";
        String coffeeMonica = "카푸치노";

        // 배열 선언 방법(1)
        // String[] coffees = new String[4];

        // 배열 선언 방법(2)
        // String coffees[] = new String[4];

        // coffees[0] = "아메리카노";
        // coffees[1] = "카페모카";
        // coffees[2] = "라떼";
        // coffees[3] = "카푸치노";

        // 배열 선언 방법(3)
        // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 방법(4)
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        coffees[2] = "에소프레소";

        // 커피 주문
        System.out.println(coffees[0] + "하나");

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 3.14};
        boolean[] b = {true, true, false};











         
    }
    
}
