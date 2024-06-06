public class Mountain extends Destiny{

    public Mountain(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama,jarak,biayaTransportasi,biayaAkomodasi);
    }

    public int hitungBiayaTransportasi(){
        return 0;
    }

    public int hitungBiayaAkomodasi() {
        if (getBiayaAkomodasi() > 500000) { // biaya akomodasi
            return (int) ((getBiayaAkomodasi() + getBiayaTransportasi()) * 0.05);
        } else {
            return 0;
        }
    }

    public int getTotalBiaya() {
        int totalCost = super.getTotalCost();
        return totalCost - hitungBiayaAkomodasi() - hitungBiayaTransportasi();
    }
}
