package skola.math.normal;

public class Triangle implements MathOperation{
    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;


    }


    @Override
    public double calcPerimeter() {
        return (a+b+c);
    }

    @Override
    public double calcArea() {
        int s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
