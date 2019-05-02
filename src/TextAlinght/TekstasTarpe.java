package TextAlinght;

public class TekstasTarpe {
    public static void main( String[] args )
    {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20 };

        long factorial = 0;

        try
        {
            System.out.print("\n\n");
            System.out.printf("%s%50s\n", "Integer", "factorial");

            for ( int number : numbers )
            {
                System.out.printf( "%4d\n", number);
                factorial = (long)1;

                for(int i=1; i <= number; i++)
                    factorial = factorial * (long)i;

//                System.out.printf("%50.0f\n",(double)factorial);
//                System.out.printf("%50.0f\n",(double)factorial);
            }

            System.out.print("\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
