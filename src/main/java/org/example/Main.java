package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean eqyit;


        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите параметры!!");
            int num = s.nextInt();
            char ch = s.next().charAt(0);
            int num1 = s.nextInt();
            System.out.println( calculeyt(num,num1,ch));


        }
    }
    public static int calculeyt(int num,int num1, char ch){
        switch (ch){
            case '+':
                System.out.println(num + num1);
                break;

            case '-':
                System.out.println(num - num1);
                break;

            case '*':
                System.out.println(num * num1);
                break;

            case '/':
                System.out.println(num / num1);
                break;
            default:
                System.out.println("введите корректный символ!");
        }
        return 0;
    }
}



