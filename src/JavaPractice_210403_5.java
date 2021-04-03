import java.util.*;

public class JavaPractice_210403_5 {
    public static void main(String[] args) {
        // 컬렉션 API의 Map에 대한 이해
        // Map의 특징 : 1. key와 value로 이루어진 열거형 집합 클래스
        //              2. key 중복은 불가능, value는 중복 가능

        Map map1 = new HashMap();
        // 이름이 담긴 문자열 배열 생성
        String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
        int[] nums = {1234,4567,2350,9870,2345};

        // Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
        // 같은 value를 put 실행을 한다면 같은 value의 마지막 keydml value값으로 덮어씀 된다.
        for(int i =0; i<names.length; i++) {
            map1.put(names[i], nums[i]);
        }
        //출력
        System.out.println(map1);
        System.out.println("홍길동 번호 : "+ map1.get("홍길동"));
        System.out.println("이순신 번호 : "+ map1.get("이순신"));
        System.out.println("김유신 번호 : "+ map1.get("김유신"));
        System.out.println("강감찬 번호 : "+ map1.get("강감찬"));

        //Map 객체에서 key들만 조회하기

        Set<String> keys = map1.keySet();
        for(String key: keys){
            System.out.println(key+"="+map1.get(key));
        }
        // Map 객체에서 value들만 조회하기
        Collection values = map1.values();
        for(Object value: values){
            System.out.println(value);
        }

        // Map 객체 key를 iterator로 조회하기
        Iterator it = keys.iterator();
        while(it.hasNext()){
            String a = (String)it.next();
            System.out.println(a+"="+map1.get(a));
        }
        //Map 객체 value를 iterator로 조회하기
        it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Map 객체에서 key, value 쌍으로 이루어진 객체 조회
        Set entry = map1.entrySet();
        for(Object o : entry){
            Map.Entry m = (Map.Entry)o;
            System.out.println("key:"+m.getKey()+", value:"+m.getValue());
        }

    }
}
