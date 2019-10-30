package ru.geekbrains.javaone.lesson_01;

public class Main {

    public static void main(String[] args) {
        System.out.println("task2");
        task2();

        System.out.println("\ntask3");
        double task3_result = task3(3, 5, 10, 2);
        System.out.println(task3_result);

        System.out.println("\ntask4");
        boolean task4_result = task4(10, 5);
        System.out.println(task4_result);

        System.out.println("\ntask5");
        task5(10);
        task5(-10);

        System.out.println("\ntask6");
        boolean task6_result = task6(-10);
        System.out.println(task6_result);

        System.out.println("\ntask7");
        task7("Петя");

        System.out.println("\ntask8");
        task8(1);
        task8(10);
        task8(100);
        task8(500);
        task8(4);
        task8(104);
        task8(400);
        task8(504);
    }

    public static void task2 () {
        byte a = 26;
        short q = 90;
        int b = 37;
        long h = 58;
        float c = 48.6f;
        double d = 10.5;
        char e = 71;
        char f = 'G';
        boolean k = true;
        System.out.println(a);
        System.out.println(q);
        System.out.println(b);
        System.out.println(h);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(k);
    }
    public static double task3 (int a, int b, int c, int d) {
        return (a * (b + (c / d)));
    }
    public static boolean task4 (int a, int b) {
        if (a + b >= 10) {
            if (a + b <= 20) {
                return true;
            }
        }
        return false;
    }

    public static void task5 (int x) {
        if (x >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean task6 (int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void task7 (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task8 (int year) {
        boolean high = false;
        if (year % 4 == 0) { // каждый четвертый год - високосный
            if (year % 100 == 0) { // но каждый сотый год - обычный
                if (year % 400 == 0) { // кроме четырехсотого года - он високосный
                    high = true;
                }
            } else { // год не сотый, значит он високосный
                high = true;
            }
        }

        if (high) {
            System.out.println("високосный год");
        } else {
            System.out.println("обычный год");
        }
    }
}

