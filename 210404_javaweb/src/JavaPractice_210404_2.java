import java.util.ArrayList;
import java.util.List;

public class JavaPractice_210404_2 {
    public static void main(String[] args) {
    //제너릭을 사용하지 않은 member 클래스 이용
        List list = new ArrayList();
        Member mem1 = new Member();
        mem1.setName("홍길동");
        mem1.setId("hong");
        mem1.setPassword("hong1234");
        mem1.setAge(40);

        list.add(mem1); //리스트에 추가

        Member mem2 = new Member();
        mem2.setName("이순신");
        mem2.setId("lee");
        mem2.setPassword("lee1234");
        mem2.setAge(50);

        list.add(mem2); // 리스트에 추가

        Member mem3 = new Member();
        mem3.setName("김유신");
        mem3.setId("kim");
        mem3.setPassword("kim1234");
        mem3.setAge(60);

        list.add(mem3); //리스트에 추가

        //리스트 개수
        System.out.println("liist.size() : "+list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println("인덱스 : "+ i
                    +", 이름 : "+((Member)list.get(i)).getName()
                    +", 아이디 : "+ ((Member)list.get(i)).getId()
                    +", 비밀번호 : "+((Member)list.get(i)).getPassword()
                    +", 나이 : "+((Member)list.get(i)).getAge());
        }
        // 제너릭을 사용한 Member 클래스 이용
        List<Member> listGenericMember = new ArrayList<>();
        listGenericMember.add(mem1);
        listGenericMember.add(mem2);
        listGenericMember.add(mem3);
        System.out.println("listGenericMember.size() : "+listGenericMember.size());
        for(int i=0; i<list.size(); i++){
            System.out.println("인덱스 : "+ i
                    +", 이름 : "+(listGenericMember.get(i)).getName()
                    +", 아이디 : "+ (listGenericMember.get(i)).getId()
                    +", 비밀번호 : "+(listGenericMember.get(i)).getPassword()
                    +", 나이 : "+(listGenericMember.get(i)).getAge());
        }
    }
}

class ClassTest1<T1,T2> implements Test1{
    @Override
    public String getTestVar1() {
        return null;
    }
    @Override
    public Integer getTestVar1(int p1) {
        return null;
    }

    @Override
    public Object getTestVar1(int p1, Object p2) {
        return null;
    }

    @Override
    public Float getTestVar1(int p1, int p2) {
        return null;
    }
    public List<T1> method1(){
        return null;
    }
    public List<T2> method2(){
        List<T2> testListT2 = new ArrayList<>();
        return testListT2;
    }
}

interface Test1<T>{
    T getTestVar1();
    T getTestVar1(int p1);
    T getTestVar1(int p1, T p2);
    Float getTestVar1(int p1, int p2);
}

