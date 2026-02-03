package inheritance;


// Parent class


class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}


// Child class 1


class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}


// Child class 2


class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}


// Child class 3

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}


// Main class

public class PolymorEx {
    public static void main(String[] args) {

        Shape s1 = new Circle();       //   upcasting
        Shape s2 = new Rectangle();    //   upcasting
        Shape s3 = new Triangle();     //   upcasting

        s1.draw();     //   Circle draw()
        s2.draw();     //   Rectangle draw()
        s3.draw();     //   Triangle draw()
    }
}
