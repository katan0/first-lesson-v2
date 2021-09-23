package com.gb;
import java.util.Scanner;
public class _7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String yourName = userInput.nextLine();
        System.out.println("Привет, " + yourName + "!");

    }
}
