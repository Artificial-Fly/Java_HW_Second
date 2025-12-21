package org;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость товара (руб): ");
        double price = scanner.nextDouble();
        System.out.print("Введите вес товара (кг): ");
        int weight = scanner.nextInt();
        double custom = ru.netology.service.CustomService.CalcCustoms(price, weight);
        System.out.println("Пошлина составит: " + custom);
    }
}