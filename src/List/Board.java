package List;

public class Board {
    String subject; // 멤버변수
    String content;
    String writer;

    // 객체 생성 시 자동으로 생성자가 호출되면서
    // 전달되는 값들을 매개변수가 받음
    public Board(String subject, String content, String writer) {

        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
