package chap_06;

public class _07_VariableScope {
    // 지역변수에 대한 설명
    // 한 메소드에서 선언한 변수는 다른 메소드에서 입력없이 사용할 수 없다는 내용
    
    public static void methodA() {
        System.out.println(number);
    }

    public static void methodB() {
        int result = 1;
    }

    public static void main(String[] args) {
        int number = 3;

        
    }
    
}
