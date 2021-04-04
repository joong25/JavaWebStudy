import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaPractice_210404_4 {
    public static void main(String[] args) {
        // HashMap 제너릭 사용
        Map<String, Object> hm = new HashMap<>();
        hm.put("name", "홍길동");
        hm.put("id","hong");
        hm.put("age",30);
        System.out.println(hm.get("name"));
        System.out.println(hm.get("id"));
        System.out.println(hm.get("age"));

        // List와 Map을 같이 사용
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> hm1 = new HashMap<>();
        hm1.put("name", "홍길동");
        hm1.put("id","hong");
        hm1.put("age",30);
        list.add(hm1);

        Map<String, Object> hm2 = new HashMap<>();
        hm2.put("name", "이순신");
        hm2.put("id","lee");
        hm2.put("age",40);
        list.add(hm2);

        Map<String, Object> hm3 = new HashMap<>();
        hm3.put("name", "김유신");
        hm3.put("id","kim");
        hm3.put("age",50);
        list.add(hm3);

        for(int i=0; i<list.size(); i++){
            System.out.println("인덱스 : "+ i
                    +", 이름 : "+list.get(i).get("name")
                    +", 아이디 : "+ list.get(i).get("id")
                    +", 비밀번호 : "+list.get(i).get("age"));
        }
    }
}
