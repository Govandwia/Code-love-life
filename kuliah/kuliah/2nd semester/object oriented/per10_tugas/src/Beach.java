public class Beach extends Destiny{
    public Beach(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama,jarak,biayaTransportasi,biayaAkomodasi);
    }

    public int hitungBiayaTransportasi(){
        if (getBiayaTransportasi() > 500000) { // biaya transportasi
            return (int) ((getBiayaAkomodasi() + getBiayaTransportasi()) * 0.05);
        } else {
            return 0;
        }
    }

    public int hitungBiayaAkomodasi() {
        return 0;
    }

    
    public int getTotalBiaya() {
        int totalCost = super.getTotalCost();
        return totalCost - hitungBiayaAkomodasi() - hitungBiayaTransportasi();
    }
    
}
