package skola.polia;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c= 0;
        int res[] = new int[21];

        res[0] = a;
        res[1] = b;
        System.out.print(res[0] + ", ");
        System.out.print(res[1]);
        for (int i = 2; i <= 20; i++) {
            c = a + b;
            res[i] = c;
            a = b;
            b = c;
            System.out.print(", " + res[i]);
        }

        System.out.println();
        MyString meno = new MyString();
        String reverse = meno.reverse("Ventilator");
        System.out.println(reverse);

        String data =" Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods. " ;
        int count = 0;
        data = data.toLowerCase();
        for (int i=0; i<(data.length()); i++){
            char z = data.charAt(i);
            switch (z){
                case 'a' : count -= -1; break;
                case 'e' : count -= -1; break;
                case 'i' : count -= -1; break;
                case 'u' : count -= -1; break;
                case 'y' : count -= -1; break;
                case 'o' : count -= -1; break;
            }
        }
        System.out.println(count);


    }
}
