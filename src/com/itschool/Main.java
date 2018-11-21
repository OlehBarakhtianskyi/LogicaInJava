package com.itschool;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1) Программа которая вычисляет частное двух чисел.");
        double numerator = 0, denominator = 0, answer_1 = 0; // Числитель, знаменатель
        System.out.println("Введите числитель");
        numerator = scan.nextDouble();
        System.out.println("Введите знаменатель");
        denominator = scan.nextDouble();
        if (denominator != 0)
        {
            answer_1 = numerator / denominator;
            System.out.println("Частное введённых двух числе равняется : " + answer_1);
        }
        else
            System.out.println("Данные введены некорректно!");
        System.out.println();

        System.out.println("2) Программа для проверки знания даты основания Одессы.");
        int year = 1794, inputYear = 0;
        System.out.println("В каком году была основана Одесса?");
        inputYear = scan.nextInt();
        if (year == inputYear){
            System.out.println("Верно, Одесса основана в " + year + " году");
        }
        else
            System.out.println("Вы ошиблись, Одесса была основана в " + year + " году.");

        System.out.println();
        System.out.println("3) Программа для вычисления стоимости покупки с учетом скидки.");
        double discount = 0, sum = 0 , sumWithDiscount = 0;
        System.out.println("Вычисление стоимости покупки с учетом скидки.");
        System.out.print("->");
        sum = scan.nextDouble();
        if (sum > 500)
        {
            System.out.println("Вам предоставляется скидка 3%");
            discount = 3;
            sumWithDiscount = sum - (sum / 100 * discount);
            System.out.println("Сумма с учетом скидки: " + sumWithDiscount + " грн");

        }
        else if (sum > 1000)
        {
            System.out.println("Вам предоставляется скидка 5%");
            discount = 5;
            sumWithDiscount = sum - (sum / 100 * discount);
            System.out.println("Сумма с учетом скидки: " + sumWithDiscount + " грн");
        }
        else {
            System.out.println("Скидка непредусмотренна");
            System.out.println("К оплате: " + sum + " грн");
        }

        System.out.println();
        System.out.println("4) Программа, которая проверяет, является ли введённое\n" +
                "пользователем целое число четным.");
        int number = 0;
        System.out.println("Введите целое число и нажмите <Enter>");
        System.out.print("->");
        number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("Число " + number + " - чётное");
        }
        else
            System.out.println("Число " + number + " - нечётное");

        System.out.println();
        System.out.println("5) Программа, которая проверяет, делится ли на три введённое с\n" +
                "клавиатуры целое число.");
        int numberOnThree;
        System.out.print("->");
        numberOnThree = scan.nextInt();
        if (number % 3 == 0)
            System.out.println("Число " + numberOnThree + " нацело на три делится.");
        else
            System.out.println("Число " + numberOnThree + " нацело на три не делится.");

        System.out.println();
        System.out.println("6) Программу для вычисления стоимости разговора по телефону с\n" +
                "учетом 20% скидки, предоставляемой по субботам и воскресеньям.");
        int talkDuration = 0, dayWeek = 0;
        double callCost = 0;
        System.out.println("Вычисление стоимости разговора по телефону.");
        System.out.println("Введите исходные данные:");
        System.out.print("Длительность разговора (целое количество минут) -> " );
        talkDuration = scan.nextInt();
        System.out.print("День недели (1 — понедельник, ... 7 — воскресенье) -> ");
        dayWeek = scan.nextInt();

       /* if (dayWeek == 6 || dayWeek == 7)
        {
            System.out.println("Предоставляется скидка 20%.");
            callCost = (talkDuration * 2) - (talkDuration * 2 / 100 * 20);
            // Стоимость разговора взята 2 грн/минута
            System.out.println("Стоимость разговора: " + callCost + " грн.");
        }
        else if (dayWeek == 1 || dayWeek == 2 || dayWeek == 3 || dayWeek == 4 || dayWeek == 5){
            callCost = (talkDuration * 2);
            System.out.println("Стоимость разговора: " + callCost + " грн.");
        }
        else
            System.out.println("Такого дня недели не существует");
        */

        switch (dayWeek) {
            case 1: {
                callCost = (talkDuration * 2);
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 2:{
                callCost = (talkDuration * 2);
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 3: {
                callCost = (talkDuration * 2);
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 4: {
                callCost = (talkDuration * 2);
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 5: {
                callCost = (talkDuration * 2);
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 6: {
                System.out.println("Предоставляется скидка 20%.");
                callCost = (talkDuration * 2) - (talkDuration * 2 / 100 * 20);
                // Стоимость разговора взята 2 грн/минута
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
            case 7: {
                System.out.println("Предоставляется скидка 20%.");
                callCost = (talkDuration * 2) - (talkDuration * 2 / 100 * 20);
                // Стоимость разговора взята 2 грн/минута
                System.out.println("Стоимость разговора: " + callCost + " грн.");
                break;
            }
                default:
                    System.out.println("Такого дня недели не существует");
        }

        System.out.println();
        System.out.println("7) Дано трехзначное число. Определить, какая из его цифр больше:");
        int numberOfThrees = 0, hundreds = 0, decimals = 0, ones = 0;
        System.out.println("Введите трёхзначное число: ");
        numberOfThrees = scan.nextInt();
        if (numberOfThrees > 99 && numberOfThrees < 1000)
        { //Проверка на трёзначность числа
            ones = numberOfThrees / 1 % 10;
            decimals = numberOfThrees / 10 % 10;
            hundreds = numberOfThrees / 100 % 10;

            if (hundreds > ones)
                System.out.println("Первое число больше последнего");
            else if (hundreds < ones)
                System.out.println("Последнее число больше первого");
            else
                System.out.println("Первое и последнее числа равны");

            if (hundreds > decimals)
                System.out.println("Первое число больше второго");
            else if (hundreds < decimals)
                System.out.println("Второе число больше первого");
            else
                System.out.println("Первое и второе числа равны");

            if (decimals > ones)
                System.out.println("Второе число больше последнего");
            else if (decimals < ones)
                System.out.println("Последнне число больше второго");
            else
                System.out.println("Второе и последнее числа равны");

        }
        else
            System.out.println("Вы ввели некорректное число");

        System.out.println();
        System.out.println("8)  Дано трехзначное число. Определить, равен ли квадрат этого числа сумме\n" +
                "кубов его цифр.");
        double number_8 = 0, one = 0, ten = 0, hundred = 0, squareNumber_8 = 0, sumOfCubes = 0;
        System.out.println("Введите трёхзначное число: ");
        number_8 = scan.nextDouble();
        if (number_8 > 99 && number_8 < 1000)
        {
            one = number_8 / 1 % 10;
            ten = number_8 / 10 % 10;
            hundred = number_8 / 100 % 10;

            squareNumber_8 = Math.pow(number_8, 2);
            sumOfCubes = Math.pow(one, 3) + Math.pow(ten, 3) + Math.pow(hundred, 3);

            if (squareNumber_8 == sumOfCubes)
                System.out.println("Квадрат этого числа равен сумме кубов его цифр");
            else
                System.out.println("Квадрат этого числа не равен сумме кубов его цифр");

        }
        else
            System.out.println("Вы ввели некорректное число");

        System.out.println();
        System.out.println("9)  Даны вещественные числа х и у, не равные друг другу. Меньшее из этих\n" +
                "двух чисел заменить половиной их суммы, а большее — их удвоенным\n" +
                "произведением.");
        double x = 0, y = 0, halfSum = 0, doubleMultiplication = 0;
        System.out.println("Введите число х : ");
        x = scan.nextDouble();
        System.out.println("Введите число y : ");
        y = scan.nextDouble();
        if (x!=y && x < y){
            x = (x + y) / 2;
            System.out.println("Меньшее число:  " + x );
            y = 2*x*y;
            System.out.println("Большее число: " + y);
        }
        else if(x!=y &&  x > y){
            y = (x + y) / 2;
            System.out.println("Меньшее число:  " + y );
            x = 2*x*y;
            System.out.println("Большее число: " + x);
        }
        else
            System.out.println("Числа введены некорректно");

        System.out.println();
        System.out.println("10) Программа решения уравнения ax3 + bх = 0 для произвольных а, b.");
        double unknown_1, unkmown_2, unknown_3, a = 0, b = 0;
        System.out.print("Введите число а -> ");
        a = scan.nextDouble();
        System.out.print("Введите число b -> ");
        b = scan.nextDouble();
        unknown_1 = 0;
        unkmown_2 = b / a;
        unknown_3 = -b / a;
        if (unknown_1 != 0 && unkmown_2 != 0 && unknown_3 != 0){
            //ОДЗ: х != 0
            System.out.println("Корни уровнения: " + unknown_1 + "\t" + unkmown_2 + "\t" + unknown_3);
        }
        else if (unkmown_2 != 0 && unknown_3 != 0){
            System.out.println("Корни уровнения: " + unkmown_2 + "\t" + unknown_3);
        }

    }
}
