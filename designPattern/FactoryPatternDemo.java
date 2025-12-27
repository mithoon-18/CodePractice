package designPattern;

//Step 1: Product interface
interface Shape {
 void draw();
}

//Step 2: Concrete Products
class Circle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle.");
 }
}

class Rectangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle.");
 }
}

class Square implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Square.");
 }
}

//Step 3: Factory Class
class ShapeFactory {
 // Factory method to create objects
 public Shape getShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     switch (shapeType.toLowerCase()) {
         case "circle":
             return new Circle();
         case "rectangle":
             return new Rectangle();
         case "square":
             return new Square();
         default:
             throw new IllegalArgumentException("Unknown shape type: " + shapeType);
     }
 }
}

//Step 4: Client
public class FactoryPatternDemo {
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     // Get objects without exposing creation logic
     Shape shape1 = shapeFactory.getShape("circle");
     shape1.draw();

     Shape shape2 = shapeFactory.getShape("rectangle");
     shape2.draw();

     Shape shape3 = shapeFactory.getShape("square");
     shape3.draw();
 }
}

