package KlaiduGaudimas;

import java.util.Scanner;

public class ZodzioRaidesIeskojimas {
    public static void main(String[] args) {
        String str = "Labas";
        char[] ch = str.toCharArray();

        System.out.println(str);

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter b number: ");
        int number2 = reader2.nextInt();
        reader2.close();

        for (int i = 0; i < ch.length; i++) {

            if (number2 - 1 == i) {
                System.out.println(ch[i]);
            }

        }
    }
}