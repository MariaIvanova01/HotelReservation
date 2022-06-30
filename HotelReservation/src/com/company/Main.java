package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] reservationInfoInput = scan.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(reservationInfoInput[0]);
        int numberOfDays = Integer.parseInt(reservationInfoInput[1]);
        Season season = Season.parse(reservationInfoInput[2]);
        DiscountType discountType = DiscountType.parse(reservationInfoInput[3]);

        System.out.printf("%.2f",
                PriceCalculator.calculatingPrice(pricePerDay, numberOfDays, season, discountType) );

    }
}
