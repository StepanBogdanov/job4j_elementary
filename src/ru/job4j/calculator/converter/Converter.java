package ru.job4j.calculator.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int exceptedEuro = 2;
        boolean passedEuro = exceptedEuro == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passedEuro);

        int dollar = Converter.rubleToDollar(180);
        int exceptedDollar = 3;
        boolean passedDollar = exceptedDollar == dollar;
        System.out.println("180 rubles are " + dollar + " dollar. Test result: " + passedDollar);
    }
}
