// 문제 : 아래 main함수 안의 코드를 보시고 Container 클래스를 작성해 보시오

public class JavaExercise_210404_1 {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(10);
        int value = container2.get();

        ContainerTwo<String,Integer> containerTwo = new ContainerTwo<>();
        containerTwo.set("홍길동",1111);
        String name1 = containerTwo.getKey();
        Integer job = containerTwo.getValue();
        System.out.println(name1);
        System.out.println(job);
    }
}

class ContainerTwo<T1,T2>{
    T1 _k;
    T2 _l;

    public void set (T1 k, T2 l){
        this._k = k;
        this._l = l;
    }
    public T1 getKey(){
        return _k;
    }
    public T2 getValue(){
        return _l;
    }
}

class Container<T> {
   T _k;

   public void set(T n){
       this._k = n;
   }

   public T get(){
       return _k;
   }
}
