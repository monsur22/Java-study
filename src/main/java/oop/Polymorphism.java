package oop;

class Polygon {
    void render() {
        System.out.println("Rendering a Shape.");
    }
}
class Square extends Polygon {
    void render(){
        System.out.println("Rendering Square.");
    }
}
class Circle extends Polygon {
    void render(){
        System.out.println("Rendering Circle.");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Square refSquare = new Square();
        refSquare.render();

        Circle refCircle = new Circle();
        refCircle.render();
    }
}
