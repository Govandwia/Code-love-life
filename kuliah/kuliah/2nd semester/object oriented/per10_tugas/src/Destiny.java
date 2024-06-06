public abstract class Destiny {
    private String nama;
    private int jarak;
    private int biayaTransportasi;
    private int biayaAkomodasi;

    public Destiny(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        this.nama = nama;
        this.jarak = jarak;
        this.biayaTransportasi = biayaTransportasi;
        this.biayaAkomodasi = biayaAkomodasi;
    }

    // getter
    public String getNama() {
        return nama;
    }
    public int getJarak() {
        return jarak;
    }
    public int getBiayaTransportasi() {
        return biayaTransportasi;
    }
    public int getBiayaAkomodasi() {
        return biayaAkomodasi;
    }
    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJarak(int jarak) {
        this.jarak = jarak;
    }
    public void setBiayaTransportasi(int biayaTransportasi) {
        this.biayaTransportasi = biayaTransportasi;
    }
    public void setBiayaAkomodasi(int biayaAkomodasi) {
        this.biayaAkomodasi = biayaAkomodasi;
    }

    // function abstract
    public abstract int hitungBiayaTransportasi();
    public abstract int hitungBiayaAkomodasi();

    public int getTotalCost(){
        int totalCost = this.biayaAkomodasi + this.biayaTransportasi;
        if (this.jarak > 1000) {
            return (int) (totalCost - (totalCost * 0.1));
        } else {
            return totalCost;
        }
    }
}
