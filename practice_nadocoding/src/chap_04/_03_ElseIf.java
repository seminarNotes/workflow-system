package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드 +1 
        // 또는 망고무스 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 쥬스

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } 
        else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        }
        else {
            System.out.println("커피 주문 완료 #1");
        }
        

        // else if는 여러번 사용 가능
        hallabongAde = false; // 한라봉 에이드
        mangoJuice = false; // 망고 쥬스
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } 
        else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        }
        else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        }
        else {
            System.out.println("커피 주문 완료 #2");
        }


        // else가 없어도 가능
        hallabongAde = false; // 한라봉 에이드
        mangoJuice = false; // 망고 쥬스
        orangeJuice = false;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } 
        else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        }
        else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        }
        System.out.println("커피 주문 완료 #3");
        
    }
    
}
