import java.util.*;

public class JavaPractice_210403_4 {
    public static void main(String[] args) {
        // 컬렉션 Iterator와 Enumeration에 대한 이해
        // 특징 : 1. 모든 컬렉션 API(List, Set)에 공통적으로 사용이 가능하다.
        //        2. 제일 많이 쓰는 3개 메소드(hashNext(), next(), remove())만 알면 List, Set에서 공통적으로 사용가능
        //        3. 속도가 느리다. 대량의 데이터 처리할 때
        //        4. 앞, 뒤 같은 단방향 반복만 가능
        //        5. 값을 변경하거나 추가할 수 없다.

        // Iterator 객체 선언
        Iterator it = null;

        //List 객체와 Set객체 선언
        List list = new ArrayList<>();
        Set set = new HashSet<>();
        for(int i=1;i<=5; i++){
            list.add(i);
            set.add(i+5);

        }
        System.out.println(list);
        System.out.println(set);

        it = list.iterator();
        System.out.println("List Iterator 출력");
        iteratorPrint(it);
        System.out.println(list);

        it = set.iterator();
        System.out.println("set Iterator 출력");
        iteratorPrint(it);
        System.out.println(set);

        //Enumeration에 대한 이해 (Vector클래스와 연결된 인터페이스)
        Vector v = new Vector();
        for(int i=1;i<=5; i++){
            v.add(i);

        }
        //Enumeration으로 출력

        Enumeration e = v.elements();
        System.out.println("Enumeration 출력");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        it = v.iterator();

        //list for문의 size() 함수와 >>> iterator 성능 비교 (결과 : size > iterator)

        // ListIterator 인터페이스 사용
        // 특징 : 1. Iterator에서 제공하지 않은 메소드 제공(양방향 조회, index값 조회 등)
        list = new ArrayList();
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        ListIterator lit = list.listIterator(); // [1,2,3,4,5] -> 1의 포인터 위치
        // 다음 요소 반복 출력                  // 1,2,3,4,5
        while(lit.hasNext()) {
            System.out.println(lit.nextIndex()); //현재 인덱스의 반환값을 준다.
            System.out.println(lit.next());
        }
        // 이전 요소 반복 출력                      // [1,2,3,4,5] -> 5의 포인터 위치
        while(lit.hasPrevious()) {                        // 5,4,3,2,1
            System.out.println(lit.previous());
        }
        // 리스트의 현재 위치한 인덱스 번호 값을 출력
        for(int i =0; i<list.size(); i++){
            System.out.println("리스트의 현재 index : "+lit.nextIndex());
            System.out.println("리스트의 현재 index 위치한 값 : "+lit.next());
        }
    }

    private static void iteratorPrint(Iterator it){
        // Iterator 객체 반복(다음 요소가 있으면 반복)
        while(it.hasNext()){
            //Iterator 객체의 다음 요소 읽어와 출력
            System.out.println(it.next());
            // 현재 요소 삭제
            it.remove();

        }
    }
}
