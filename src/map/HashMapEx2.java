package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();

        map.put("apple", "사과");
        map.put("summer", "여름");
        map.put("candy", "캔디");
        map.put("school", "학교");
        map.put("water", "물");

        while(true) {
            System.out.print("찾고 싶은 단어는? ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            } else {
                if (map.keySet().contains(input)) {
                    System.out.println(map.get(input));
                } else {
                    System.out.println(input + "은(는) 없는 단어입니다.");
                }
            }

        }
    }

}

