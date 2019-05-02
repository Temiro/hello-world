package Krepsinis;
//public class Employee implements Comparable<Employee>{

public class krepsininkai implements Comparable<krepsininkai>{
    private Integer numeris;
    private String vardas;
    private String pavarde;
    //----- Pasipildome
    private Integer baudos =0;
    private Integer dvitaskiai=0;
    private Integer tritaskaii=0;
    private Integer nepataikiti=0;
    private Integer kiekBuvoPramesta=0;

    public krepsininkai(Integer numeris, String vardas, String pavarde) {
        this.numeris = numeris;
        this.vardas = vardas;
        this.pavarde = pavarde;

//        this.baudos = baudos;
//        this.dvitaskiai = dvitaskiai;
//        this.tritaskaii = tritaskaii;
//        this.nepataikiti = nepataikiti;
//        this.kiekBuvoPramesta = kiekBuvoPramesta;
    }

//    public krepsininkai(Integer baudos, Integer dvitaskiai, Integer tritaskaii, Integer nepataikiti, Integer kiekBuvoPramesta) {
//        this.baudos = baudos;
//        this.dvitaskiai = dvitaskiai;
//        this.tritaskaii = tritaskaii;
//        this.nepataikiti = nepataikiti;
//        this.kiekBuvoPramesta = kiekBuvoPramesta;
//    }


    public krepsininkai(Integer numeris, String vardas,String pavarde,
                        Integer baudos, Integer dvitaskiai,
                        Integer tritaskaii, Integer nepataikiti,
                        Integer kiekBuvoPramesta) {
        this.numeris = numeris;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.baudos = baudos;
        this.dvitaskiai = dvitaskiai;
        this.tritaskaii = tritaskaii;
        this.nepataikiti = nepataikiti;
        this.kiekBuvoPramesta = kiekBuvoPramesta;
    }

    @Override
    public String toString() {
        return numeris + " " + vardas + " " + pavarde+ " "+ baudos + " "+
                dvitaskiai+ " " +tritaskaii+ " "+nepataikiti+ " "+kiekBuvoPramesta+"\n";
    }

    public Integer getNumeris() {
        return numeris;
    }

    public void setNumeris(Integer numeris) {
        this.numeris = numeris;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Integer getBaudos() {
        return baudos;
    }

    public void setBaudos(Integer baudos) {
        this.baudos = baudos;
    }

    public Integer getDvitaskiai() {
        return dvitaskiai;
    }

    public void setDvitaskiai(Integer dvitaskiai) {
        this.dvitaskiai = dvitaskiai;
    }

    public Integer getTritaskaii() {
        return tritaskaii;
    }

    public void setTritaskaii(Integer tritaskaii) {
        this.tritaskaii = tritaskaii;
    }

    public Integer getNepataikiti() {
        return nepataikiti;
    }

    public void setNepataikiti(Integer nepataikiti) {
        this.nepataikiti = nepataikiti;
    }

    public Integer getKiekBuvoPramesta() {
        return kiekBuvoPramesta;
    }

    public void setKiekBuvoPramesta(Integer kiekBuvoPramesta) {
        this.kiekBuvoPramesta = kiekBuvoPramesta;
    }


    @Override
    public int compareTo(krepsininkai o) {
        int comp = getNumeris().compareTo(o.getNumeris());
        if (comp != 0) return comp;
//        comp = getPavarde().compareTo(o.getPavarde());
//        if (comp != 0) return comp;
//        comp = getDepartamentas().compareTo(o.getDepartamentas());
//        if (comp != 0) return comp;
//        comp = getAlga().compareTo(o.getAlga());
//        if (comp != 0) return comp;



        return comp;
    }
}
