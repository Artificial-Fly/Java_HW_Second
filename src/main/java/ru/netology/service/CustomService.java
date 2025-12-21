package ru.netology.service;

public class CustomService {

    static final int CUSTOM_KOEF_FOR_WEIGHT = 100;
    static final double CUSTOM_KOEF_FOR_PRICE = 100;
    public static double CalcCustoms(double price, int weight){
        double fineByPrice = price / CUSTOM_KOEF_FOR_PRICE;
        int fineByWeight = weight*CUSTOM_KOEF_FOR_WEIGHT;
        return fineByPrice+fineByWeight;
    }
}
