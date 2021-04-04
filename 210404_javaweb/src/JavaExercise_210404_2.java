import java.util.ArrayList;
import java.util.List;

// 문제 : 아래의 BoardDao 클래스의 dao 객체의 getBoardList() 메소드를 호출하면
//          List<Board>타입의 컬렌션을 리턴합니다. 아래 클래스를
//          실행하면 다음과 같이 출력될 수 있도록 BoardDao의  getBoardList()메소드를
//          작성하시오.
//          출력 결과는 아래와 같습니다.
//          제목1 - 본문내용1
//          제목2 - 본문내용2
//          제목3 - 본문내용3
public class JavaExercise_210404_2 {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board board : list){
            System.out.println(board.getTitle()+" - "+ board.getContent());
        }
    }
}
class Board{
    private String title;
    private String content;
    // 코드 작성


    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
}
class BoardDao{
    // 코드 작성

    public List<Board> getBoardList(){
        List<Board> list= new ArrayList<>();
        Board board1 = new Board("제목1","본문내용1");
        Board board2 = new Board("제목2","본문내용2");
        Board board3 = new Board("제목3","본문내용3");

        list.add(board1);list.add(board2);list.add(board3);
        return list;
    }
}