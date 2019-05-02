package Swich;

import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Iveskinte skaiciu kuri lyginsime");
        int a = reader1.nextInt();

        switch (a){
            case 1:
                System.out.print("Pirmadienis");
                break;
            case 2:
                System.out.print("Antradienis");
                break;
            case 3:
                System.out.print("Treciadienis");
                break;
            case 4:
                System.out.print("Ketvirtadienis");
                break;
            case 5:
                System.out.print("Penktadienis");
                break;
            case 6:
                System.out.print("Sestadienis");
                break;
            case 7:
                System.out.print("sekmadienis");
                break;
            default:
                System.out.println("Kaip?");
                break;
        }
    }



}
