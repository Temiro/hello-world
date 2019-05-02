package AA__TiesiniaiAlgoritmai.Pamoka;

public class PamokuSkaicius {
    private Integer pam;
    private Integer laikas;

    public PamokuSkaicius(Integer pam, Integer laikas) {
        this.pam = pam;
        this.laikas = laikas;
    }

    @Override
    public String toString(){
        return pam + " " + laikas;
    }

    public Integer getPam() {
        return pam;
    }

    public void setPam(Integer pam) {
        this.pam = pam;
    }

    public Integer getLaikas() {
        return laikas;
    }

    public void setLaikas(Integer laikas) {
        this.laikas = laikas;
    }
}
