package skola;

import java.util.Random;
import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        City city = new City();
        city.getRandomCity();
        city.play();
    }

    public String getRandomCity(){
        String[] array = new String[] {"Zvolen", "Presov", "Bratislava"};
        Random rnd = new Random();
        int num = rnd.nextInt(array.length);
        return array[num];
    }

    public void play(){
        //mame 3 random cisla
        //vypise na tych 3 miestach pismena
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        String city = getRandomCity().toUpperCase();
        int i = 0;
        int count = 0;
        String tip = "";
        boolean yes = false;

        while(i<3){
            tip = "";
            char[] used = randomLetter(city);
            for (int j = 0; j < city.length(); j++){
                yes = false;
                char z = city.charAt(j);
                for (char k : used){
                    if (k == z){
                        yes = true;
                    }
                }
                if (yes == true){
                    tip += z;
                }
                else{
                    tip += "_";
                }
            }
            System.out.println(tip);
            i++;
            System.out.println("What city do you think this is?");
            String myGuess = sc.nextLine();
            count -= -1;
            if (city.compareToIgnoreCase(myGuess)==0){
                System.out.println("You have won in \033[31m" + count + ".\033[0m tries!");
                break;
            }
        }
    }

    public char[] randomLetter(String city){
        Random rnd = new Random();
        char[] letters = new char[3];
        char[] used = new char[3];
        int run = 0;

        while(run<3){
            int j = rnd.nextInt(city.length());
            boolean yes = false;
            for (int k = 0; k < city.length(); k++) {
                char z = city.charAt(k);
                if (z == city.charAt(j)) {
                    for (char i : used){
                        if (i == z){
                            yes = true;
                        }
                    }
                    if (yes == true){
                        break;
                    }
                    else {
                        letters[run] = z;
                        used[run] = z;
                        run++;
                        break;
                    }
                }
            }
        }
        return letters;
    }
}
