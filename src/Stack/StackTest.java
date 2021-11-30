package Stack;

import java.util.Stack;

// java.util.Stack 클래스 사용

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        try {
            stk.push("홍길동");
            stk.push("이몽룡");
            stk.push("성춘향");

            for(int i=0; i<stk.size(); i++) {
                System.out.println(i + ": " + stk.get(i));
            }
            // 0: 홍길동
            // 1: 이몽룡
            // 2: 성춘향

            System.out.println("스택 크기 : " + stk.size());
            System.out.println("최상위 값 : " + stk.peek());
            System.out.println("이몽룡 들어 있나? : " + stk.contains("이몽룡"));
            System.out.println("pop 수행1 : " + stk.pop());
            System.out.println("pop 수행2 : " + stk.pop());

            for(int i=0; i<stk.size(); i++) {
                System.out.println(i + ": " + stk.get(i)); // 0: 홍길동
            }

            System.out.println("clear 수행");
            stk.clear();
            System.out.println("empty? : " + stk.empty());

            System.out.println("pop 수행3 : " + stk.pop());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
