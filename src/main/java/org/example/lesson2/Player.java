package org.example.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    String name;
    int number = 0;

    public void guess() {
        while (true) {
            try {
                System.out.print("Введите число от 0 до 9: ");
                number = sc.nextInt();
                if (number >= 0 && number <= 9) {
                    break;
                } else {
                    System.out.println("Число должно быть от 0 до 9. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: вы ввели не число! Пожалуйста, введите целое число от 0 до 9.");
                sc.next();
            }
        }
        System.out.println("Думаю, это число " + number);
    }
}