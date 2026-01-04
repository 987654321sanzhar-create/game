package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int totalAnswer = 0;
    static int totalCorreckt = 0;
    static int ball = 0;
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        while (true) {
            int sum = 0;
            int summa = 0;
            System.err.println("===МЕНЮ!===");
            System.out.println("1. Сложения (+) ");
            System.out.println("2. Вычитания (-) ");
            System.out.println("3. Умножения (*) ");
            System.out.println("4. Деление (/) ");
            System.out.println("5. Смешанные примеры ");
            System.out.println("6. Статистика ");
            System.out.println("7. Выход ");
            System.out.print("Выберите режим -> ");
            int sMode = s.nextInt();
            switch (sMode) {
                case 1:
                    playRaundPlus(r, s);
                    break;
                case 2:
                    playRaundMinus(r,s);
                    break;
                case 3:
                    multiplication(r,s);
                    break;
                case 4:
                    division(r,s);
                    break;
                case 5:
                    mixed(r,s);
                    break;
                case 6:
                    statisticks();
                    break;
            }

        }
    }

    public static int playRaundPlus(Random r, Scanner s) {;
        System.out.print("Сколько примеров решить? ");
        int count = s.nextInt();
        boolean[] results = new boolean[count];
        for (int i = 0; i < count; i++) {
            int a = r.nextInt(1, 10);
            int b = r.nextInt(1, 10);
            System.out.print("Пример " + (i + 1) + ":" + a + " + " + b + " = ");
            int Answer = s.nextInt();
            totalAnswer++;
            int correct = a + b;
            if (Answer == correct) {
                results[i] = true;
                totalCorreckt++;
                ball+= 10;
                System.out.println("Правельно + 10 баллов!!!");
            } else {
                results[i] = false;
                System.out.println("неправельно!!!");
                System.out.println(a + " + " + b + " = "+correct);
                System.out.println(" ");
            }

        }
        System.out.println("=== РЕЗУЛЬТАТ РАУНДА ===");
        for (int i = 0; i < results.length; i++) {
            if (results[i] == true){
                System.out.println("Пример "+(i + 1)+" (+10 ,баллов)");
            }else {
                System.out.println("Пример "+(i + 1)+" (0 ,баллов)");
            }
        }
        System.out.println("у вас всего "+ball+" баллов");
        return 0;
    }
    public static void statisticks(){
        int prochent = 0;
        System.out.println("Всего решено примеров "+totalAnswer);
        System.out.println("Правельных ответов "+totalCorreckt);
            prochent =(int)((double) totalCorreckt / totalAnswer * 100);

        System.out.println("Процент правельных ответов "+prochent);
        System.out.println("Общий счот "+ball);
    }
    public static int playRaundMinus(Random r, Scanner s) {;
        System.out.print("Сколько примеров решить? ");
        int count = s.nextInt();
        boolean[] results = new boolean[count];
        for (int i = 0; i < count; i++) {
            int a = r.nextInt(1, 10);
            int b = r.nextInt(1, 10);
            System.out.print("Пример " + (i + 1) + ":" + a + " - " + b + " = ");
            int Answer = s.nextInt();
            totalAnswer++;
            int correct = a - b;
            if (Answer == correct) {
                results[i] = true;
                totalCorreckt++;
                ball+= 10;
                System.out.println("Правельно + 10 баллов!!!");
            } else {
                results[i] = false;
                System.out.println("неправельно!!!");
                System.out.println(a + " + " + b + " = "+correct);
                System.out.println(" ");
            }

        }
        System.out.println("=== РЕЗУЛЬТАТ РАУНДА ===");
        for (int i = 0; i < results.length; i++) {
            if (results[i] == true){
                System.out.println("Пример "+(i + 1)+" (+10 ,баллов)");
            }else {
                System.out.println("Пример "+(i + 1)+" (0 ,баллов)");
            }
        }
        System.out.println("у вас всего "+ball+" баллов");
        return 0;
    }
    public static int multiplication(Random r, Scanner s) {;
        System.out.print("Сколько примеров решить? ");
        int count = s.nextInt();
        boolean[] results = new boolean[count];
        for (int i = 0; i < count; i++) {
            int a = r.nextInt(1, 10);
            int b = r.nextInt(1, 10);
            System.out.print("Пример " + (i + 1) + ":" + a + " * " + b + " = ");
            int Answer = s.nextInt();
            totalAnswer++;
            int correct = a * b;
            if (Answer == correct) {
                results[i] = true;
                totalCorreckt++;
                ball+= 10;
                System.out.println("Правельно + 10 баллов!!!");
            } else {
                results[i] = false;
                System.out.println("неправельно!!!");
                System.out.println(a + " + " + b + " = "+correct);
                System.out.println(" ");
            }

        }
        System.out.println("=== РЕЗУЛЬТАТ РАУНДА ===");
        for (int i = 0; i < results.length; i++) {
            if (results[i] == true){
                System.out.println("Пример "+(i + 1)+" (+10 ,баллов)");
            }else {
                System.out.println("Пример "+(i + 1)+" (0 ,баллов)");
            }
        }
        System.out.println("у вас всего "+ball+" баллов");
        return 0;
    }
    public static int division(Random r, Scanner s) {;
        System.out.print("Сколько примеров решить? ");
        int count = s.nextInt();
        boolean[] results = new boolean[count];
        for (int i = 0; i < count; i++) {
            int a = r.nextInt(1, 10);
            int b = r.nextInt(1, 10);
            System.out.print("Пример " + (i + 1) + ":" + a + " / " + b + " = ");
            int Answer = s.nextInt();
            totalAnswer++;
            int correct = a / b;
            if (Answer == correct) {
                results[i] = true;
                totalCorreckt++;
                ball+= 10;
                System.out.println("Правельно + 10 баллов!!!");
            } else {
                results[i] = false;
                System.out.println("неправельно!!!");
                System.out.println(a + " + " + b + " = "+correct);
                System.out.println(" ");
            }

        }
        System.out.println("=== РЕЗУЛЬТАТ РАУНДА ===");
        for (int i = 0; i < results.length; i++) {
            if (results[i] == true){
                System.out.println("Пример "+(i + 1)+" (+10 ,баллов)");
            }else {
                System.out.println("Пример "+(i + 1)+" (0 ,баллов)");
            }
        }
        System.out.println("у вас всего "+ball+" баллов");
        return 0;
    }
    public static void mixed(Random r,Scanner s) {
        System.out.print("Сколько примеров решить? ");
        int count = s.nextInt();
        boolean[] results = new boolean[count];
        for (int i = 0; i < count; i++) {
            int a = r.nextInt(1, 10);
            int b = r.nextInt(1, 10);
            int num = r.nextInt(1, 5);
            boolean[] resulte = new boolean[count];
            if (num == 1) {
                System.out.print("Пример " + (i + 1) + ":" + a + " + " + b + " = ");
                int answer = s.nextInt();
                int correct = a + b;
                totalAnswer++;
                if (answer == correct) {
                    totalCorreckt++;
                    results[i] = (answer == a + b);
                    System.out.println("Правельно!!! +10 бфллов");
                } else {
                    results[i] = false;
                    System.out.println("не правельно!!!");
                }

            } else if (num == 2) {
                System.out.print("Пример " + (i + 1) + ":" + a + " - " + b + " = ");
                int answer = s.nextInt();
                int correct = a - b;
                totalAnswer++;
                if (answer == correct) {
                    totalCorreckt++;
                    results[i] = (answer == a - b);
                    System.out.println("Правельно!!! +10 бфллов");
                } else {
                    results[i] = false;
                    System.out.println("не правельно!!!");
                }
            } else if (num == 3) {
                System.out.print("Пример " + (i + 1) + ":" + a + " * " + b + " = ");
                int answer = s.nextInt();
                int correct = a * b;
                totalAnswer++;
                if (answer == correct) {
                    totalCorreckt++;
                    results[i] = (answer == a * b);
                    System.out.println("Правельно!!! +10 бфллов");
                } else {
                    results[i] = false;
                    System.out.println("не правельно!!!");
                }
            } else if (num == 4) {
                System.out.print("Пример " + (i + 1) + ":" + a + " / " + b + " = ");
                int answer = s.nextInt();
                int correct = a / b;
                totalAnswer++;
                if (answer == correct) {
                    totalCorreckt++;
                    results[i] = (answer == a / b);
                    System.out.println("Правельно!!! +10 бфллов");
                } else {
                    results[i] = false;
                    System.out.println("не правельно!!!");
                }
            }
        }
            System.out.println("=== РЕЗУЛЬТАТ РАУНДА ===");
            for (int i = 0; i < results.length; i++) {
                if (results[i] == true) {
                    System.out.println("Пример " + (i + 1) + " (+10 ,баллов)");
                } else {
                    System.out.println("Пример " + (i + 1) + " (0 ,баллов)");
                }
            }
            System.out.println("у вас всего " + ball + " баллов");
        }



