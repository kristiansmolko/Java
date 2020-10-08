package skola.math.normal;

public class Main {
    public static void main(String[] args) {
        Square stvorec1 = new Square(3);
        double result = stvorec1.calcPerimeter();
        System.out.println("Obvod stvorca je: " + result);
        double result1 = stvorec1.calcArea();
        System.out.println("Obsah stvoreca je: " + result1);
        double diagonale = stvorec1.calcDiagonale();
        System.out.println(diagonale);

        Rectangle obdlznik1 = new Rectangle(4,5);
        double result2 = obdlznik1.calcPerimeter();
        System.out.println(" ");
        System.out.println("Obvod obdlznika je: " + result2);
        double result3 = obdlznik1.calcArea();
        System.out.println("Obsah obdlznika je: " + result3);
        double diagonale1 = obdlznik1.calcDiagonale();
        System.out.println("Uhlopriecka je dlha: " + diagonale1);

        Circle kruznica1 = new Circle(4);
        double result4 = kruznica1.calcPerimeter();
        System.out.println(" ");
        System.out.println("Obvod kruznice je: " + result4);
        double result5 = kruznica1.calcArea();
        System.out.println("Obsah kruznice je: " + result5);

        Triangle trojuholnik1 = new Triangle(3, 6, 5);
        System.out.println(" ");
        double result6 = trojuholnik1.calcPerimeter();
        System.out.println("Obvod trojuholnika je: " + result6);
        double result7 = trojuholnik1.calcArea();
        System.out.println("Obsah trojuholnika je: " + result7);
    }

}
