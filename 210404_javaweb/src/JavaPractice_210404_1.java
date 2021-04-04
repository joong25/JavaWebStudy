import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class JavaPractice_210404_1 {
    public static void main(String[] args) {
        // 자바 제너릭(Generic)에 대한 이해(List, Set, Map에서 다수 사용)

        // java 1.5 버전 이상에서만 가능
        // 사용하는 이유 :  1. 컴파일 시에 강한 타입 체크 가능
        //                  2. 타입 변환 코드를 제거 가능
        List list1 = new ArrayList();

        //String x = (String)list1.get(3);

        List<String> genericList1 = new ArrayList<>();
        genericList1.add("1");
        genericList1.add("2");
        genericList1.add("3");
        String y1 = genericList1.get(2); //2.타입 변환 코드를 제거 가능
        int y2 = Integer.parseInt(genericList1.get(2));

        List<Integer> genericList2 = new ArrayList<Integer>();
        genericList2.add(1);
        genericList2.add(2);
        genericList2.add(3);

        // Generic과 Object클래스와의 비교

        List<Object> genericList3 = new ArrayList<>();

        // Object 클래스를 사용하는 경우
        NoGeneric nogen = new NoGeneric();
        String[] ss = {"홍길동","이순신","김유신"};

        // Object 타입 매개변수에 String 배열 객체 전달
        nogen.set(ss);
        nogen.print();

        Object[] objs = nogen.get();
        for(Object o : objs){
            String s = (String)o; // String으로 강제형변환
            System.out.println(s);
        }

        Integer[] ii = {1,2,3};
        // Object 타입 매개변수에 Integer배열 객체 전달
        nogen.set(ii);
        nogen.print();
        objs = nogen.get();
        System.out.println("==================================");
        for(Object o : objs){
            String s = String.valueOf(o); // String으로 강제형변환
            System.out.println(s);
        }

        System.out.println("=========================");
        // Generic을 사용하는 경우
        Generic<String> gen1 = new Generic<>();
        String[] ss1 = {"홍길동","이순신","김유신"};

        // String 제너릭 타입의 매개변수에 String 배열 객체 전달
        gen1.set(ss1);
        gen1.print();


        Generic<Integer> gen2 = new Generic<>();
        Integer[] ii1 = {1,2,3};
        // Integer 제너릭 타입의 매개변수에 Integer 배열 객체 전달
        gen2.set(ii1);
        gen2.print();

    }
}

/*
generic example
public void swap(int n1, int n2){
    int temp = n1;
    n1=n2;
    n2 = temp;
}
public void swap(double n1, double n2){
    double temp = n1;
    n1=n2;
    n2 = temp;
}
public void swap(Object n1, Object n2){
    Object temp = n1;
    n1=n2;
    n2 = temp;
}
public void swap(T n1, T n2){   //템플릿 이름은 대문자로
    T temp = n1;
    n1=n2;
    n2 = temp;
}
 */


class Generic<T1>{
    T1[] _v;
    void set(T1[] n){
        this._v = n;
    }
    T1[] get(){
        return this._v;
    }
    void print(){
        for (T1 o : _v) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}

class NoGeneric{
    Object[] _v;
    void set(Object[] n){
        this._v = n;
    }
    Object[] get(){
        return this._v;
    }
    void print(){
        for (Object o : _v) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
