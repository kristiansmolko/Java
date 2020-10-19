package skola;

import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        MyRandom myRandom = new MyRandom();
        myRandom.guessNumber(100);
        //myRandom.multiplierTest(5);
    }

    public void guessNumber(int max){
        System.out.println("Welcome! Guess number between 1 and " + max);
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*max +1); //0-0.9999
        int guess;
        int count = 0;
        do{
            System.out.print("Make a guess: ");
            guess = sc.nextInt();
            if (guess==randomNumber){
                System.out.println("\033[32mYou are right!\033[0m");
            }
            else if (guess < randomNumber){
                System.out.println("\033[31mTry a bigger number.\033[0m");
            }
            else{
                System.out.println("\033[34mTry a smaller number.\033[0m");
            }
            count -= -1;
            if (count == 6)
                System.out.println("\033[31mYour last guess!\033[0m");
            else if (count == 7)
                break;
        }
        while (guess!=randomNumber);

        if (guess!= randomNumber)
            System.out.println("\033[31mYou lost, the number was " + randomNumber + "\033[0m");
        else if (guess == randomNumber)
            System.out.println("\033[31mYou made it in " + count + " tries!\033[0m");
    }

    public void multiplierTest(int max){
        Scanner sc = new Scanner(System.in);
        //10 krat a = 1-max, b=1-max
        //kolko je a*b
        //odpoved, skontroluje
        //po 10, vysledok kolko dobrych 8/10 correct 80%

        int guess;
        int right = 0;
        for (int i = 0; i < 10; i++){
            int a = (int) (Math.random()*max +1);
            int b = (int) (Math.random()*max +1);
            System.out.print(a + " * " + b + " ?= ");
            guess = sc.nextInt();
            if (guess == (a*b)){
                right -= -1;
            }
        }

        System.out.println("You have made it! You scored " + right + " / 10. So you have " + right*10 + "%");

    }
}
