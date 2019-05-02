package Degalai;

import java.util.Scanner;

public class Geles {
    public static void main(String[] args) {
        Double sum;

        System.out.println("Penkiu Dienu sporto skaiciuokle");

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Kokiek geliu zydi? ");
        int a = reader1.nextInt();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Kokiek geliu prazysta kiekviena diena? ");
        int b = reader2.nextInt();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Kiek dienu praejo? ");
        int n = reader3.nextInt();

        System.out.println("po "+n+" dienu zydes "+ (a+b*n) + " geliu");

    }
}
