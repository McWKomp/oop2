package mainPack.figuresPack;

import java.util.ArrayList;

public class figureTask {
    public static void main(String[] args) {
        ArrayList<Figure> arr = new ArrayList<>();

        Triangle triangle = new Triangle();
        triangle.height = 15;
        triangle.width = 10;

        Rectangle rectangle = new Rectangle();
        rectangle.height = 15;
        rectangle.width = 10;

        arr.add(triangle);
        arr.add(rectangle);

        for (Figure figure:arr) {
            figure.findSquare();
        }

    }
}

abstract class Figure{
    int height;
    int width;
    public abstract void findSquare();
}
class Triangle extends Figure{
    @Override
    public void findSquare() {
        System.out.println("The square of this triangle is "+(0.5*(width * height)));
    }
}

class Rectangle extends Figure{

    @Override
    public void findSquare() {
        System.out.println("The square of this rectangle is "+height*width);
    }
}