package fakturosTik___AntraUzduotis;

public class Employee implements Comparable<Employee>{

    private String vardas;
    private String pavarde;
    private String departamentas;
    private Double alga;

    public Employee(String vardas, String pavarde, String departamentas, Double alga) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.departamentas = departamentas;
        this.alga = alga;
    }


    @Override
    public String toString() {
        return vardas +" "+ pavarde +" "+ departamentas + " " + alga +"\n";

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

    public String getDepartamentas() {
        return departamentas;
    }

    public void setDepartamentas(String departamentas) {
        this.departamentas = departamentas;
    }

    public Double getAlga() {
        return alga;
    }

    public void setAlga(Double alga) {
        this.alga = alga;
    }

//    @Override
//    public int compareTo(masinuMasyvas o) {
//        int comp = getVardas().compareTo(o.getVardas());
//        if (comp != 0) return comp;
//        comp = getPavarde().compareTo(o.getPavarde());
//        if (comp != 0) return comp;
//        comp = getMarke().compareTo(o.getMarke());
//        if (comp != 0) return comp;
//        comp = getNumeris().compareTo(o.getNumeris());
//        if (comp != 0) return comp;
//
//
//
//        return comp;
//    }

//    @Override
    @Override
    public int compareTo(Employee o) {
        int comp = getVardas().compareTo(o.getVardas());
        if (comp != 0) return comp;
        comp = getPavarde().compareTo(o.getPavarde());
        if (comp != 0) return comp;
        comp = getDepartamentas().compareTo(o.getDepartamentas());
        if (comp != 0) return comp;
        comp = getAlga().compareTo(o.getAlga());
        if (comp != 0) return comp;



        return comp;
    }
}
