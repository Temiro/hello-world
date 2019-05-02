package Degalai;

import java.util.Scanner;

public class Treniruotes {
    public static void main(String[] args) {
        Double sum;

        System.out.println("Penkiu Dienu sporto skaiciuokle");

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme Pirmadieni: ");
        Double number1 = reader1.nextDouble();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme Antradieni: ");
        Double number2 = reader2.nextDouble();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme Treciadieni: ");
        Double number3 = reader3.nextDouble();

        Scanner reader4 = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme Ketvirtadieni: ");
        Double number4 = reader4.nextDouble();

        Scanner reader5 = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme Penktadieni: ");
        Double number5 = reader5.nextDouble();

        sum= number1+number2+number3+number4+number5;



        System.out.println("Is viso treniravosi "+sum*60+" min");


    }
}
