package UdemyExercise.Abstraction;

abstract class Shape {
    abstract void draw();
}

class Square extends Shape{
    void draw() {
        System.out.println("Square Drawing...");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle drawing...");
    }
}

class Test{
    public static void main(String[] args) {
        Shape shape=new Square();
        shape.draw();
    }
}

