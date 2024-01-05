package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0
    
    
        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 입력하기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동변환)


        // 숫자 -> 문자
        String s1 = String.valueOf(93);
        String s2 = Integer.toString(93);
        System.out.println(s1); // 93
        System.out.println(s2); // 93

        String s3 = String.valueOf(98.9);
        System.out.println(s3);

        String s4 = Double.toString(98.9);
        System.out.println(s4);

        // 문자 -> 숫자
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.9");
        System.out.println(d);
    }
    
}
