package skola.password;

import java.util.Random;

public class Password {
    public static void main(String[] args) {
        Password pass = new Password();
        System.out.println(pass.randomCapitalPassword());
        System.out.println(pass.randomCapitalPassword(10));
        System.out.println(pass.randomPassword());
    }

    public String randomCapitalPassword(){
        //vrati nahodne heslo 8 znakov velke pismena
        Random rnd = new Random();
        String pass = "";
        for (int i = 0; i < 8; i++){
            char z = (char)(rnd.nextInt(26)+65);
            pass = z + pass;
        }
        return pass;
    }

    public String randomCapitalPassword(int length){
        //vrati nahodne heslo 8 znakov velke pismena
        Random rnd = new Random();
        String pass = "";
        for (int i = 0; i < length; i++){
            char z = (char)(rnd.nextInt(26)+65);
            pass = z + pass;
        }
        return pass;
    }

    public String randomPassword(){
        //male pismena, velke pismena, cislice
        // A15dfRw8aS
        Random rnd = new Random();
        String pass = "";
        int i = 0;
        int countSmall = 0;
        int countBig = 0;
        int countDigits = 0;
        while(i<10){
            int j = rnd.nextInt(3);
            char z = 0;
            switch(j){
                case 0: z = (char) (rnd.nextInt(9)+48); countDigits -= -1; break;
                case 1: z = (char) (rnd.nextInt(26)+65); countBig -= -1; break;
                case 2: z = (char) (rnd.nextInt(26)+97); countSmall -= -1; break;
            }
            if (i>8){
                if (countBig == 0){
                    z = (char) (rnd.nextInt(26)+65);
                }
                else if (countSmall == 0){
                    z = (char) (rnd.nextInt(26)+97);
                }
                else if (countDigits == 0){
                    z = (char) (rnd.nextInt(10)+48);
                }
            }
            i++;
            pass += z;
        }

        return pass;
    }
}
