package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 4개의 단어를 입력받고 가장 긴 단어와 단어의 길이 출력하는 프로그램 작성
        ArrayList<String> ar = new ArrayList<String>();

        for(int i = 0; i< 4; i++) {
            System.out.print("단어 입력 : ");
            ar.add(sc.nextLine()); //next()
        }

        int max = ar.get(0).length();
        String maxStr = ar.get(0);
        for(int i = 1; i < ar.size(); i++) {
            if(max < ar.get(i).length()) {
                max = ar.get(i).length();
                maxStr = ar.get(i);
            }
        }

        System.out.println("단어 리스트 : " + ar);
        System.out.println("길이의 최대값은 : " + max);
        System.out.println("가장 긴 단어 : " + maxStr);
    }

}
