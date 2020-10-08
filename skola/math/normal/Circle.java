package skola.math.normal;

public class Circle implements MathOperation{
    private int a;

    public Circle(int a){
        this.a = a;
    }

    @Override
    public double calcPerimeter() {
        return (2*Math.PI*a);
    }

    @Override
    public double calcArea() {
        return (Math.PI*(a*a));
    }
}
