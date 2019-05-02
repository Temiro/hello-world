package NamuDarbai;

public class Zmones {
    private String vardas;
    private String pavarde;
    private String numeriai;

    public Zmones(String vardas, String pavarde, String numeriai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.numeriai = numeriai;
    }

    @Override
    public String toString(){
        return vardas + " " + pavarde + " " + numeriai;
    }

}
