package Ciklai;

public class IndexuSumaRiba {
    public static void main(String[] args) {

        int sum = 0 ;
        for (int j = 0; j < 20; j++) {

//            System.out.println(j);
            sum += j;

            if(sum >= 12){
                break;
            }
        }
        System.out.println(sum);
    }
}
