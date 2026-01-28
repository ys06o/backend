package DAY07;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {  //생성자
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width*this.height;
    }

    }