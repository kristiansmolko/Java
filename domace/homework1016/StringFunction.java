package domace.homework1016;

public class StringFunction {
    public static void main(String[] args) {
        String text = "Skola";
        String myText[] = new String[text.length()];

        int i = 0;
        while (i<=text.length()){
            for (int j = i; j < text.length(); j++){
                char z = text.charAt(j);
                myText[j] = String.valueOf(z);
                System.out.print(myText[j]);
            }
            System.out.println();
            i -= -1;
        }
    }
}
