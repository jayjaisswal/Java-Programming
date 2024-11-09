package Practicals;

interface Shape {
    void draw();
}

interface ColoredShape extends Shape {
    void color(); 
}

class Oval implements ColoredShape {
    public void draw() {
        System.out.println("Drawing an Oval");
    }

    public void color() {
        System.out.println("Coloring the Oval");
    }
}

public class ExtendingInterface {
    public static void main(String[] args) {
        ColoredShape myOval = new Oval();
        myOval.draw(); 
        myOval.color(); 
    }
}
