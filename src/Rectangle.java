public class Rectangle extends Shape {
    //필드
    double _a;
    double _b;

    //생성자
    Rectangle(){
        this(1,2);
    }
    Rectangle(double a, double b){
        this._a = a; this._b = b;
    }

    @Override
    double area() {
        return (_a * _b);
    }

    @Override
    double length() {
        return (_a + _b)*2;
    }


}
