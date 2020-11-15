package domace.homework1115;

public class Main {
    public static void main(String[] args) {
        Main count = new Main();
        String number1 = "45698521456987552145698852145855478562145569898544";
        String number2 = "125478552000065656115618564856153";
        String result = count.sucet(number1, number2);
        System.out.println(result);
    }

    public String sucet(String num1, String num2){
        String count = "";
        int len = 0;
        if (num1.length() > num2.length())
            len = num1.length();
        else
            len = num2.length();
        num2 = addNums(num1, num2);  //musel som nejak doplnit ten druhy string
        int dig1, dig2;
        for (int i = 0; i < len; i++){
            dig1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            dig2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            count = count + String.valueOf((dig1+dig2));
        }
        return count;
    }

    public static String addNums(String num1, String num2){ //takze som si vytvoril metodu, ktora doplni 0
        int len = num1.length() - num2.length();
        if (num1.length() > num2.length()){
            for (int i = 0; i < len; i++){
                num2 = num2 + "0";
            }
            return num2;
        }
        else {
            for (int i = 0; i < len; i++) {
                num1 = num1 + "0";
            }
            return num1;
        }
    }

}
