package skola.math.planimetria;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 0;
        }
    }

    public void print() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    public double getDistanceFromZero(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public void flip(char type){
        if(type=='x' || type=='X'){
            y = y*(-1);
        }
        else if (type=='y' || type=='Y'){
            x = x*(-1);
        }

    }

}
