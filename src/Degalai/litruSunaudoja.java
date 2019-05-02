package Degalai;

import java.util.Scanner;

public class litruSunaudoja {
    public static void main(String[] args) {
        double k = 7.5;
        double m = 305.5;
        Integer n= 4;
        Double kk = 4.09;

        Double s = k * m / 100;

        Double sumaZmogui = s * kk / n;
        System.out.println("Suma vienam zmogui: " + sumaZmogui);

    }
}
