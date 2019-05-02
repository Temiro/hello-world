package TrikampioPlotas;

import java.util.Scanner;

public class ArSkaiciusLyginis {
    public static void main(String[] args) {
//        Scanner reader1 = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        Double a = reader1.nextDouble();
        System.out.println("Tikriname ar skaicius lyginis");

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Iveskinte skaiciu kuri lyginsime");
        Double a = reader1.nextDouble();

        if (a % 2 == 0) {
            System.out.println("Lyginis");
        } else{
            System.out.println("Neyginis");
        }

    }

}
