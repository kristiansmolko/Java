package skola.twodarray;

public class Table {
    private int[][] arr = new int[][]{ {2,5,8,0},{5,1,7,9},{-9,1,8,14}};

    public static void main(String[] args) {
        Table t = new Table();
        int value = t.min();
        System.out.println("Minimum is: " + value);
        value = t.max();
        System.out.println("Maximum is: " + value);
        double avg = t.avg();
        System.out.println("Average is: " + avg);
        value = t.sumUnderDiagonale();
        System.out.println("Summary is: " + value);

    }

    public int min(){
        int minimum = arr[0][0];
        for (int i = 0; i < 3; i++){
            for ( int j = 0; j < 4; j++){
                minimum = arr[i][j]<minimum?arr[i][j]:minimum;
            }
        }
        return minimum;
    }

    public int max(){
        int maximum = arr[0][0];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                maximum = arr[i][j]>maximum?arr[i][j]:maximum;
            }
        }
        return maximum;
    }

    public double avg(){
        double avg = 0;
        int count = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                avg += (arr[i][j]);
                count -= -1;
            }
        }
        avg /= count;
        return avg;
    }

    public int sumUnderDiagonale(){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
