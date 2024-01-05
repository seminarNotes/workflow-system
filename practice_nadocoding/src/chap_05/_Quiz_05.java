package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        /*퀴즈5
            배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을
            출력하는 프로그램을 작성하시오.

            조건
            신발 사이즈는 250부터 295까지 5단위로 증가
            신발 사이즈 수는 총 10가지


        */

        // 작성한 답안
        int[] sizeArrray = new int[10];
        for (int i = 0; i < sizeArrray.length; i++) {
            sizeArrray[i] = 250 + i * 5;
        }
        for (int size : sizeArrray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
    
}
