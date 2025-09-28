package org.example.lesson2.randomGame;


public class GuessGame {
    Player p1;
    Player p2;

    public void startGame()  {
        p1 = new Player();
        p2 = new Player();


        int guessp1 = 0;
        int guessp2 = 0;


        boolean p1isRight = false;
        boolean p2isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Введите свои числа!");

            p1.guess();
            p2.guess();

            guessp1 = p1.number;
            System.out.println("Анна думает, что это " + guessp1);
            guessp2 = p2.number;
            System.out.println("Красава думает, что это " + guessp2);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (p1isRight || p2isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Анна: " + (p1isRight ? "угадала!" : "проиграла."));
                System.out.println("Красава: " + (p2isRight ? "угадал!" : "проиграл."));
                System.out.println("Загаданное число было: " + targetNumber);
                System.out.println("Game over!");
                break;
            } else {
                System.out.println("Никто не угадал, игра продолжается");
            }
        }
    }
}
