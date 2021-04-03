public class Circle extends Shape {
    //필드
    double _r;   //반지름
    static int cnt = 1;
    String _circleName;

    // 생성자(constructor)
    Circle(){
        this(1);
    }
    Circle(double r){
        this._r = r;
    }
    //Shape에 있는 메소드 재정의(오버라이딩)

    @Override
    double area() { //원의 면적 구하는 메소드
        return _r*_r * Math.PI;
    }

    @Override
    double length() {   //원의 길이 구하는 메소드
        return 2*_r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_r=" + _r +
                '}';
    }

    @Override
    public int hashCode() {
        return (int)_r;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle){
            Circle c = (Circle) obj;
            return this._r==c._r;
        }
        else{
            return false;
        }
    }
}
