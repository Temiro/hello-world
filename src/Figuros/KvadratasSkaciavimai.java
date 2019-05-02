package Figuros;

public interface KvadratasSkaciavimai {

        default Double perimetras( double krastine ) {
        return 4 * krastine;
    }

    default Double plotas( double krastine ) {
        return Math.pow(krastine, 2);
    }
}
