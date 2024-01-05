package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        /*퀴즈2
            어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는
            프로그램을 작성하시오.

            조건
            키가 120cm 이상인 경우에만 탑승 가능
            삼항 연산자 이용
        */

        // 작성한 답안
        int height = 115;
        String sentence = (height >= 120) ? "키가 " +  String.valueOf(height) + "cm이므로 탑승 가능합니다." : "키가 " +  String.valueOf(height) + "cm이므로 탑승 불가능합니다";
        System.out.println(sentence);
        height = 121;
        sentence = (height >= 120) ? "키가 " +  String.valueOf(height) + "cm이므로 탑승 가능합니다." : "키가 " +  String.valueOf(height) + "cm이므로 탑승 불가능합니다";
        System.out.println(sentence);

    }
    
}
