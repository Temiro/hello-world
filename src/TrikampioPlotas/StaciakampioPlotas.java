package TrikampioPlotas;

//Stačiojo trikampio plotą

import java.util.Scanner;

public class StaciakampioPlotas {
    public static void main(String[] args) {

        System.out.println("Staciakampio ploto skaiciuokle");

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = reader1.nextInt();
//        reader1.close();
//        System.out.println(number1);

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter b number: ");
        int number2 = reader2.nextInt();
        reader2.close();


        System.out.println("Staciakampio plotas:");
        System.out.println(number1*number2);

    }


}
