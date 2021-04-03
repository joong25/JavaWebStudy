import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class JavaPractice_210403_1 {
    public static void main(String[] args) {
        //컬렉션 프레임워크에 대한 이해(Collection API)
        // List(1차원 열거형), Set(1차원 열거형), Map(key 와 value가 있는 1차원 열거형)
        // 주의 : List, Set , Map 은 인터페이스(구현해야 하는것)
        // List -> ArrayList, Stack, Vector, Linkedlist, Queue, PriorityQueue....
        // List <-> Array
        // Set -> HashSet, TreeSet
        // Map -> HashMap, Hashtable, TreeMap, Properties

        //Wrapper Class -> 기본 자료형(int, long, float..)을 클래스화 시킨 클래스들
        // -> Integer, Short, Boolean, Double...

        // ArrayList실습
        java.util.List list1 = new ArrayList();
        list1.add(1); //데이터 타입을 맞춘다
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        // 배열과의 차이점
        int[] arrInt1 = new int[3];
        arrInt1[0] = 1;
        arrInt1[1] = 2;
        arrInt1[2] = 3;

        for(int i=0; i<list1.size(); i++){
            System.out.println(i + ":"+list1.get(i));
        }
        for(int i=0; i<arrInt1.length; i++){
            System.out.println(i + ":"+arrInt1[i]);
        }
        //리스트 추가(add), 수정(함수없음), 삭제(remove), 삽입(add) 실습
        //[1,2,3] -> [1,4,3]
        for(int i=0; i<list1.size(); i++){
            if(i==1){
                list1.remove(i);
                list1.add(i, 4);    //클래스의 오버로딩을 이용

            }
        }
        System.out.println(list1);
        list1.remove(new Integer(4)); //[1,3]
        System.out.println(list1);
        list1.add(5);
        list1.add(7);
        list1.add(3,6);
        System.out.println(list1);

        // Vector클래스 사용 -> 구 버전에서 많이 사용함. 요즘은 잘 사용 안함
        Vector list = new Vector();
        list.add(1.2);
        list.add(Math.PI);
        list.addElement(3.4);
        for(Object o : list){
            System.out.println(o);
        }
        double num =3.4;
        // 해당 요소의 인덱스 (없으면 -1)
        int index = list.indexOf(num);  //2
        if(index>=0){
            //내부 요소값이 존재한다.
            System.out.println(num+"의 위치 :"+index);
        }
        else{
            System.out.println(num+"는 리스트에 없습니다");
        }

        num = 1.2;
        if(list.contains(num)){
            //제거(이전 메서드)
            list.removeElement(num);
            System.out.println(num+"삭제됨");

        }
        else{
            System.out.println(num+"값이 list에 존재하지 않음");
        }
    }
}