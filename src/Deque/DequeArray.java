package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

// java.util.Deque 인터페이스를 ArrayDeque로 구현

public class DequeArray {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();

        System.out.println("데이터 4개 삽입");
        dq.add("포도");
        System.out.println(dq);
        dq.add("배");
        System.out.println(dq);
        dq.add("수박");
        dq.offer("사과");
        System.out.println(dq); // [포도, 배, 수박, 사과] <-

        System.out.println("\n앞 쪽에 삽입");
        dq.addFirst("바나나");
        System.out.println(dq);  // -> [바나나, 포도, 배, 수박, 사과]

        System.out.println("\n 삽입");
        dq.add("복숭아");          // [바나나, 포도, 배, 수박, 사과, 복숭아]  <-
        System.out.println(dq);
        dq.addLast("복숭아"); // == add() [바나나, 포도, 배, 수박, 사과, 복숭아, 복숭아] <-
        System.out.println(dq); // 동일한 값 삽입 가능

        System.out.println("\npeek 수행 : " + dq.peek()); // 맨 앞의 값 출력
        System.out.println("\n데크 사이즈 : " + dq.size()); // 현재 데이터 수

        System.out.println("\n데크 순회");
        for(String item : dq) {
            System.out.print(item + " "); // 바나나 포도 배 수박 사과 복숭아 복숭아
        }

        System.out.println("\n데이터 꺼내기");
        System.out.println("remove : " + dq.remove()); // 바나나 (앞에서 삭제)
        System.out.println(dq); // [포도, 배, 수박, 사과, 복숭아, 복숭아]

        // 찾아서 삭제
        System.out.println("사과 remove : " + dq.remove("사과")); // 사과 remove : true
        System.out.println(dq); // [포도, 배, 수박, 복숭아, 복숭아]

        System.out.println("딸기 remove : " + dq.remove("딸기")); // 없으면 false
        System.out.println(dq);

        System.out.println("\n앞 쪽에 삽입");
        dq.addFirst("복숭아");
        System.out.println(dq); // [복숭아, 포도, 배, 수박, 복숭아, 복숭아]

        System.out.println("복숭아 remove : " + dq.remove("복숭아")); // 여러 개 중에서 1개만 삭제
        System.out.println(dq);  // 3개 중에서 맨 앞에 1개만 삭제

        System.out.println("removeAll : " + dq.removeAll(dq));   // 큐 전체 삭제
        System.out.println(dq);

        System.out.println("데이터 4개 삽입");
        dq.add("포도");
        dq.add("배");
        dq.add("수박");
        dq.offer("사과");
        System.out.println(dq);

        System.out.println("poll : " + dq.poll()); // 포도 (맨 앞의 값 삭제)
        System.out.println(dq); //[배, 수박, 사과]

        System.out.println("pollFirst : " + dq.pollFirst()); // == poll()과 종일
        System.out.println(dq);

        System.out.println("pollLast : " + dq.pollLast()); // 사과
        System.out.println(dq); // [수박]

        // 데크를 스택처럼 사용할 때
        System.out.println("push 수행");
        dq.push("밤");  // addFirst()와 동일
        dq.push("밤");
        System.out.println(dq);

        System.out.println("pop 수행 : " + dq.pop()); // 밤 (맨 앞 삭제)
        System.out.println(dq); // [밤, 수박]
    }

}

