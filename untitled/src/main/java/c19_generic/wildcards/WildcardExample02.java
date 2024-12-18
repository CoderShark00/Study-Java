package c19_generic.wildcards;

import java.util.List;

class Shape{
    public void draw(){
        System.out.println("모양을 그립니다");
    }
}

class Cricle extends Shape{
    @Override
    public void draw(){
        System.out.println("원을 그립니다.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("직사각형을 그립니다.");
    }
}

public class WildcardExample02 {
    public static void drawShapes(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<Cricle> cricles = List.of(new Cricle(), new Cricle());
        List<Rectangle> rectangles = List.of(new Rectangle(), new Rectangle());

        drawShapes(cricles);
        drawShapes(rectangles);


    }
}
