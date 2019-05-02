package SkaniausiSaldainiai;

import java.util.List;

public class Saldainiai {
    private String pavadinimas;
    private Integer kiekSaldainiu;
//    private List<String> saldainiuPavadinimai;

    public Saldainiai(String pavadinimas, Integer kiekSaldainiu) {
        this.pavadinimas = pavadinimas;
        this.kiekSaldainiu = kiekSaldainiu;
//        this.saldainiuPavadinimai = saldainiuPavadinimai;
    }

    @Override
    public String toString(){
//        return pavadinimas+kiekSaldainiu+saldainiuPavadinimai;
        return pavadinimas+kiekSaldainiu;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getKiekSaldainiu() {
        return kiekSaldainiu;
    }

    public void setKiekSaldainiu(Integer kiekSaldainiu) {
        this.kiekSaldainiu = kiekSaldainiu;
    }

//    public List<String> getSaldainiuPavadinimai() {
//        return saldainiuPavadinimai;
//    }
//
//    public void setSaldainiuPavadinimai(List<String> saldainiuPavadinimai) {
//        this.saldainiuPavadinimai = saldainiuPavadinimai;
//    }
}
