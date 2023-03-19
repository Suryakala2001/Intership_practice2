//create a class named "Shape" with three methods named "area", In first method find the area of the rectangle, second method find the area of the circle and third method find the area of the square.

class Shape {
    public void area(float w, float l) {
        float area = w * l;
        System.out.println("Area is " + area);
    }


    public void area(float r) {
        float area = 3.14f * r * r;
        System.out.println("Area is " + area);
    }


    public void area(double a) {
        double area = a * a;
        System.out.println("Area is " + area);
    }


}


class Shapemain {
    public static void main(String[] args) {
        Shape calculate = new Shape();
        calculate.area(4, 6);
        calculate.area(7,6);
        calculate.area(6,6);
    }
}