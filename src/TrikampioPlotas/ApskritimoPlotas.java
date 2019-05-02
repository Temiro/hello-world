
package TrikampioPlotas;

//Stačiojo trikampio plotą

        import java.util.Scanner;

public class ApskritimoPlotas {
    public static void main(String[] args) {

        System.out.println("Staciakampio ploto skaiciuokle");


//        reader1.close();
//        System.out.println(number1);

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter r number: ");
        Double number2 = reader2.nextDouble();
        reader2.close();


        System.out.println("Apskritimas plotas:");

        System.out.println((number2*number2)*Math.PI);
//        su skelimu kvadratu
//        System.out.println(Math.pow(number2,2)*Math.PI);

    }


}