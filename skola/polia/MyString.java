package skola.polia;

public class MyString {
    public String reverse(String text) {

        char[] pole = text.toCharArray();
        int len = text.length();
        int len2 = len / 2;
        for (
                int i = 0;
                i < len2; i++) {
            char m = pole[len - i - 1];
            pole[len - i - 1] = pole[i];
            pole[i] = m;
        }

        String result = String.valueOf(pole);
        return result;
    }
}
