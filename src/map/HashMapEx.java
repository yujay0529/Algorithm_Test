package map;
import java.util.*;

public class HashMapEx {

        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<String, Integer>();

            //객체 저장 (key, value)
            map.put("홍길동", 85);
            map.put("이몽룡", 90);
            map.put("홍길동", 80);// 동일 키 존재 : 값 새로 덮어씀
            map.put("성춘향", 95);

            System.out.println("총 Entry 수 : " + map.size());
            System.out.println(map);

            // key로 검색 : value 반환
            System.out.println("\n홍길동 검색 : " + map.get("홍길동"));

            System.out.println();
            //key 값 출력
            System.out.println(map.keySet());

            // key와 value 출력
            for(String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

            // 객체 삭제 : remove(key)
            map.remove("홍길동");
            System.out.println("\n총 Entry 수 : " + map.size());

            // 전체 객체 삭제
            map.clear();
            System.out.println("\n총 Entry 수 : " + map.size());

        }

}
