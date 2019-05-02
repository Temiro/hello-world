package Figuros;

public interface StaciakampisTrikampisSkaiciavimai {
    default Double perimetras(Double krastine1, Double krastine2, Double krastine3) {
    return krastine1 * +krastine2 + krastine3;
}

    default Double plotas(Double krastine1, Double krastine2, Double krastine3) {
        if(krastine1 > krastine2 && krastine1 > krastine3) {
            return krastine2 * krastine3;
        } else if (krastine2 > krastine1 && krastine2 > krastine3) {
            return krastine1 * krastine3;
        } else {
            return krastine1 * krastine2;
        }
    }

}
