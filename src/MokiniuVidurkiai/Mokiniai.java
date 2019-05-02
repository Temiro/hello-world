package MokiniuVidurkiai;

import java.util.List;

public class Mokiniai {
    private String vardasPav;
    private String klase;
    private List<Mokiniai> pazimiai;
    private Double vidurkisNeapvalintas;
    private Integer vidurkisSuapvalintas;

    public Mokiniai(String vardasPav, String klase, List<Mokiniai> pazimiai) {
        this.vardasPav = vardasPav;
        this.klase = klase;
        this.pazimiai = pazimiai;
    }

//    public Mokiniai(List<Mokiniai> pazimiai) {
//        this.pazimiai = pazimiai;
//    }

    public String getVardasPav() {
        return vardasPav;
    }

    public void setVardasPav(String vardasPav) {
        this.vardasPav = vardasPav;
    }

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public List<Mokiniai> getPazimiai() {
        return pazimiai;
    }

    public void setPazimiai(List<Mokiniai> pazimiai) {
        this.pazimiai = pazimiai;
    }

    public Double getVidurkisNeapvalintas() {
        return vidurkisNeapvalintas;
    }

    public void setVidurkisNeapvalintas(Double vidurkisNeapvalintas) {
        this.vidurkisNeapvalintas = vidurkisNeapvalintas;
    }

    public Integer getVidurkisSuapvalintas() {
        return vidurkisSuapvalintas;
    }

    public void setVidurkisSuapvalintas(Integer vidurkisSuapvalintas) {
        this.vidurkisSuapvalintas = vidurkisSuapvalintas;
    }
}
