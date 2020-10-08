package skola.math.normal;

public class Square implements MathOperation{
    private int a;

    public Square(int a){
        this.a = a;
    }

    @Override
    public double calcPerimeter() {
        return 4*a;
    }

    @Override
    public double calcArea() {
        return a*a;
    }

    public double calcDiagonale(){
        return Math.sqrt(2)*a;
    }

}
