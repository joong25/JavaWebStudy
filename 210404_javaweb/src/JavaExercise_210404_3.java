import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
문제 : HashSet에 Student 클래스를 저장하려고 합니다. 학번이 같으면 동일한
Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다.
Student 클래스에서 재정의해야 하는 hashCode()와 equals() 메소드의 내용을 채워보세요.
Student의 해시코드는 studentNum라고 가정합니다.
 */
public class JavaExercise_210404_3 {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();
        set1.add(new Student(1, "홍길동"));
        set1.add(new Student(2, "신용권"));
        set1.add(new Student(1, "조민우"));

        Iterator<Student> iterator = set1.iterator();
        while(iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println(stu.studentNum+" : "+stu.name);
        }
    }
}

class Student{
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode(){
        // 코드 작성

        return studentNum;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        if(studentNum != student.studentNum) return false;

        return true;
    }
}


