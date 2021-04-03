import java.util.HashSet;
import java.util.Set;

public class JavaPractice_210403_3 {
    public static void main(String[] args) {
        // 자바 컬렉션의 Set(집합)에 대한 이해
        // Set의 특징 : 1. 중복된 값이 존재하지 않는다.
        //              2. List 컬렉션 연산 보다 빠르다.
        Object[] arr = {"홍길동", "이순신", "홍길동", "이순신", 1, 2, "1", "2"};
        // HashSet 객체 생성
        Set set1 = new HashSet();
        for(int i =0 ; i< arr.length; i++){
            set1.add(arr[i]);
        }
        System.out.println(set1);

        Set set2 = new HashSet();
        //문자열 클래스 객체 두개 생성
        boolean setReturn1 = set2.add(new String("abc"));
        boolean setReturn2 = set2.add(new String("abc"));
        System.out.println("setReturn1 : "+ setReturn1);
        System.out.println("setReturn2 : "+ setReturn2);
        boolean setReturn3 = set2.add("abcd");
        boolean setReturn4 = set2.add("abcd");
        System.out.println("setReturn3 : "+ setReturn3);
        System.out.println("setReturn4 : "+ setReturn4);
        System.out.println(set2);

        // Circle 객체 두 개 추가(사용자 정의 클래스)
        Circle.cnt=1;
        set2.add(new Circle(3.0));
        Circle.cnt =2;
        set2.add(new Circle(3.0));
        System.out.println(set2);

        //[abc, Circle{_r=3.0}, abcd] 이렇게 만들려면 equals(), hashCode()를 재정의 해서 return 값이 true로 만들고 hashCode()값이 같도록 하면 중복처리가 된다.
    }
}
