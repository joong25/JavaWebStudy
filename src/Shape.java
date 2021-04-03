public abstract class Shape { //ab클래스는 메소드 만들때
    // 필드(field)
    int _x, _y;
    //생성자(constructor)
    Shape(){
        this(0,0); //Shape (intx inty)호출
    }
    Shape(int x, int y){
        this._x = x;
        this._y = y;
    }
    //추상 메소드
    abstract double area(); //접근제어자 default 메소드
    abstract double length(); //접근제어자 default 메소드

    //구현 메소드
    public String getLocation(){
        return _x +","+_y;
    }; //default 메소드
}

