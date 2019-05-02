package MokiniuVidurkiai;

import java.util.List;

public class Pazimiai {
    private List<Mokiniai> pazimiai;

    public Pazimiai(List<Mokiniai> pazimiai) {
        this.pazimiai = pazimiai;
    }

    public List<Mokiniai> getPazimiai() {
        return pazimiai;
    }

    public void setPazimiai(List<Mokiniai> pazimiai) {
        this.pazimiai = pazimiai;
    }
}
