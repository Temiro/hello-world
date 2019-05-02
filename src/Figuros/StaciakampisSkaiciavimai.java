package Figuros;

public interface StaciakampisSkaiciavimai {
    default Double perimetras(Double krastine1, Double krastine2) {
        return krastine1 * 2 + krastine2 * 2;
    }

    default Double plotas(Double krastine1, Double krastine2) {
        return krastine1 * krastine2;
    }
}
