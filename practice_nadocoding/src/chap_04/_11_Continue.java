package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue


        // 치킨 주문 손님 중 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? noShow
            if (i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold += 1;
            if (sold == max) {
                System.err.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문을 탈출
            }  
        }
        System.out.println("영업을 종료합니다. #1");

    

        // While문
        sold = 0;
        int index = 0; // 손님 대기 번호
        while (index <= 50){
            index += 1; 
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            
            // 손님이 없다면? noShow
            if (index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            
            sold += 1;
            if (sold == max) {
                System.err.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문을 탈출
            }
            
        }
        System.out.println("영업을 종료합니다. #2");
    }
    
}
