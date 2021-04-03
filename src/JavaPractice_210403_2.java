import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class JavaPractice_210403_2 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        // list 객체에 요소를 추가
        list1.add(new Circle(3.0));
        list1.add(new Rectangle(3.0,4.0));
        list1.add(new Circle(5.0));
        list1.add(new Rectangle(5.0,6.0));

        System.out.println("전체 도형의 둘레의 합:" +getLength(list1));
        System.out.println("전체 도형의 면적의 합:" +getArea(list1));

        //일반 List 와 Linked List의 차이점
        // array의 특징 : 1. array는 next 포인터가 없다
        //                2. get() 메소드 속도가 빠르다.
        //                  3. add(value) 메소드 속도가 빠르다.
        //                  4. add(index, value)메소드 속도가 느리다.
        // -> 0 - 1 - 2 - 3 ....
        // linkedlist의 특징 : 1. next 포인터 존재
        //                      2. get() 메소드 속도가 느리다.
        //                      3. add(value) 메소드 속도가 느리다.
        //                  4. add(index, value)메소드 속도가 빠르다.
        // -> 0(다음 포인터의 index 2) -> 2(다음 포인터의 index 1) -> 1 -> ...

        ArrayList alist = new ArrayList();
        LinkedList llist = new LinkedList();

        for(int i =0; i<100000; i++){
            alist.add(i);
            llist.add(i);
        }

        System.out.println("ArrayList Access");
        long start = System.currentTimeMillis(); // long형의 시간값 13자리
        for(int i=0; i<100000; i++){
            alist.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("LinkedList Access");
        start = System.currentTimeMillis(); // long형의 시간값 13자리
        for(int i=0; i<100000; i++){
            llist.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static double getLength(List list){
        double value =0;
        for(int i=0; i<list.size(); i++){
            Shape s = (Shape)list.get(i);
            value += s.length();
        }
        return value;
    }  //총 길이를 구하는 메소드

    private static double getArea(List list){
        // 총 면적 구하는 메소드
        double value = 0;
        for(int i=0; i<list.size(); i++){
            Shape s = (Shape)list.get(i);
            value += s.area();
        }
        return value;
    }
}
