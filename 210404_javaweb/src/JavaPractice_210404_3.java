public class JavaPractice_210404_3 {
    public static void main(String[] args) {
        // 2개 이상의 제너릭 타입 실습
        Generic2<String, Integer> gen1 = new Generic2<>();
        gen1.set("홍길동", 1111);

        System.out.println("<String, Integer>");
        System.out.println("name:"+gen1.get_name());
        System.out.println("id:"+gen1.get_id());

        Generic2<String, String> gen2 = new Generic2<>();
        gen2.set("홍길동", "1111");
        gen2.set("이순신", "A111");

        System.out.println("<String, String>");
        System.out.println("name:"+gen2.get_name());
        System.out.println("id:"+gen2.get_id());

    }
}

class Generic2<K, V>{
    K _name;
    V _id;

    void set(K name, V id){
        this._name = name;
        this._id = id;
    }

    public K get_name() {
        return _name;
    }

    public void set_name(K _name) {
        this._name = _name;
    }

    public V get_id() {
        return _id;
    }

    public void set_id(V _id) {
        this._id = _id;
    }
}
