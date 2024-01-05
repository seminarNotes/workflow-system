package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /*퀴즈4
            조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

            조건
            주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
            경차 또는 장애인 차량은 최종 요금에서 50% 할인 (장애인 차량 : 직접 운동 또는 탑승 모두 포함)

        */

        // 작성한 답안
        int parkingFee = 4000;
        int dailyMaximum = 30000;
        int hour = 10;
        boolean discountCase = true;

        int amountFee = parkingFee * hour ;
        if (amountFee > dailyMaximum)
            amountFee = dailyMaximum;
        if (discountCase) {
            amountFee /= 2;
        }
        System.out.println("주차 요금은 " + amountFee + "원 입니다.");
        
        



    }
    
}
