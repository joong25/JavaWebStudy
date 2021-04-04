public class JavaPractice_210404_5 {
    public static void main(String[] args) {
        // 제너릭의 클래스 제한 기능 이해
        // 1. <? super Obj> : Obj의 부모클래스 자료형을 참조 가능
        // 2. <? extends Obj> : Obj의 자식클래스 자료형을 참조 가능
        // 3. <?> : 모든 자료형을 참조 가능
        // 4. <T extends Obj> : T의 자식클래스 자료형을 참조 가능

        Gen3 g3 = new Gen3();
        // Gen1만 가져올 수 있음.
        Generic5<? super Gen2> g2 = new Generic5<>(g3);
        //Gen2 t1 = g2.get();  //error Gen2는 Gen2의 부모클래스가 아니다.
        //Gen3 t2 = g2.get(); //error Gen3는 Gen2의 부모클래스가 아니다.
        Gen1 t3 = (Gen2)g2.get();
        Gen1 t4 = (Gen3)g2.get();
        Object t5 = g2.get();
        System.out.println(t3._name);
        System.out.println(t3.getName());
        System.out.println(t4._name);
        System.out.println(t4.getName());

        // Gen2, Gen3 가져올 수 있음
        Generic5<? extends Gen2> g4 = new Generic5<>(g3);
        Gen2 t6 = g4.get(); //Gen2 클래스 가져옴
        Gen3 t7 = (Gen3)g4.get(); //Gen2 클래스 가져옴
        System.out.println(t6._name);
        System.out.println(t6.getName());
        System.out.println(t7._name);
        System.out.println(t7.getName());

        //<?> 모든 클래스 타입 가져오는 것이 가능
        Generic5<?> g5 = new Generic5<>(g3); //Generic5<Object> g5 = new Generic5<>();
        Object t8 = (int)g5.get();
        Gen3 t9 = (Gen3)g5.get();
        System.out.println(t8.toString());
        System.out.println(t9._name);
        System.out.println(t9.getName());

        // MyUtil 클래스 사용
        // int result1 = MyUtil.compareNumber("123","345");   //error
        int result2 =  MyUtil.compareNumber(123,345);
    }
}

// 메소드에 제너릭 세팅 실습
class MyUtil{
    static <T1 extends Number> int compareNumber(T1 t1, T1 t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return Double.compare(v1, v2); // v1이 v2보다 작으면 -1, 같으면 0, 크면 1
    }
    static <T2 extends String> String addString(T2 t1, T2 t2){
        StringBuilder sb= new StringBuilder();
        sb.append(t1);  // == sb.append(t1.toString())
        sb.append(t2);  // == sb.append(t2.toString())

        return sb.toString();
    }
}

class Gen1 {
    String _name = "Gen1";

    String getName(){
        return _name;
    }
}

class Gen2 extends Gen1{
    String _name = "Gen2";
    String getName(){
        return _name;
    }
}

class Gen3 extends Gen2{
    String _name = "Gen3";
    String getName(){
        return _name;
    }
}

class Generic5<T>{
    T obj;
    Generic5(T obj){
        this.obj = obj;
    }
    void set(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}

