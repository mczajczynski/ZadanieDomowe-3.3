public class ShapeCalculator {

    int squareArea(Square square) {
        return square.a * square.a;
    }
    double circleArea(Circle circle){
        return circle.ray * 3.14 * 2;
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }
    double rectPerimeter(Rectangle rectangle){
        return 2*rectangle.a + 2*rectangle.b;
    }
}

