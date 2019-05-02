package ProgramuotojuKlase;

public class Kriterijai {
    private Integer KiekPateks;
    private Integer KiekVietu;

    public Kriterijai(Integer kiekPateks, Integer kiekVietu) {
        KiekPateks = kiekPateks;
        KiekVietu = kiekVietu;
    }
    @Override
    public String toString(){
        return getKiekPateks()+" "+getKiekVietu();
    }

    public Integer getKiekPateks() {
        return KiekPateks;
    }

    public void setKiekPateks(Integer kiekPateks) {
        KiekPateks = kiekPateks;
    }

    public Integer getKiekVietu() {
        return KiekVietu;
    }

    public void setKiekVietu(Integer kiekVietu) {
        KiekVietu = kiekVietu;
    }
}
