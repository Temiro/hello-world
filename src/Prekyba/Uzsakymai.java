package Prekyba;

public class Uzsakymai {
    private Integer id;
    private Integer sk;


    public Uzsakymai(Integer id, Integer sk) {
        this.id = id;
        this.sk = sk;
    }

    @Override
    public String toString(){
        return id+" "+sk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSk() {
        return sk;
    }

    public void setSk(Integer sk) {
        this.sk = sk;
    }
}
