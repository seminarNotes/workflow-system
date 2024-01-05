package chap_04;

public class _09_MutiplicationTable {
    public static void main(String[] args) {
        // 구구단 만들기
        
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j ++)
                System.err.println(i + " * " + j + " = " + (i * j));
            System.out.println();
        }
    }
    
}
