package Figuros;

public class Staciakampis extends Figura  implements StaciakampisSkaiciavimai{
    private Double krastine1;
    private Double krastine2;

    public Staciakampis(Double krastine1, Double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

//    public Double perimetras() {
//        return krastine1 * 2 + krastine2 * 2;
//    }
//
//    public Double plotas() {
//        return krastine1 * krastine2;
//    }

    @Override
    public String toString() {
        return "Perimetras = " + perimetras(krastine1, krastine2) + " Plotas = " + plotas(krastine1, krastine2);
    }

    public Double getKrastine1() {
        return krastine1;
    }

    public void setKrastine1(Double krastine1) {
        this.krastine1 = krastine1;
    }

    public Double getKrastine2() {
        return krastine2;
    }

    public void setKrastine2(Double krastine2) {
        this.krastine2 = krastine2;
    }
}