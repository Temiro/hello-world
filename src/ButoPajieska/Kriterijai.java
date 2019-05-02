package ButoPajieska;

public class Kriterijai {
    private Integer minKambSk;
    private Integer maxKambSk;
    private Double minKvSk;
    private Double maxKvSk;
    private Double minKain;
    private Double maxKain;

    public Kriterijai(Integer minKambSk, Integer maxKambSk, Double minKvSk, Double maxKvSk, Double minKain, Double maxKain) {
        this.minKambSk = minKambSk;
        this.maxKambSk = maxKambSk;
        this.minKvSk = minKvSk;
        this.maxKvSk = maxKvSk;
        this.minKain = minKain;
        this.maxKain = maxKain;
    }


    public Integer getMinKambSk() {
        return minKambSk;
    }

    public void setMinKambSk(Integer minKambSk) {
        this.minKambSk = minKambSk;
    }

    public Integer getMaxKambSk() {
        return maxKambSk;
    }

    public void setMaxKambSk(Integer maxKambSk) {
        this.maxKambSk = maxKambSk;
    }

    public Double getMinKvSk() {
        return minKvSk;
    }

    public void setMinKvSk(Double minKvSk) {
        this.minKvSk = minKvSk;
    }

    public Double getMaxKvSk() {
        return maxKvSk;
    }

    public void setMaxKvSk(Double maxKvSk) {
        this.maxKvSk = maxKvSk;
    }

    public Double getMinKain() {
        return minKain;
    }

    public void setMinKain(Double minKain) {
        this.minKain = minKain;
    }

    public Double getMaxKain() {
        return maxKain;
    }

    public void setMaxKain(Double maxKain) {
        this.maxKain = maxKain;
    }
}
