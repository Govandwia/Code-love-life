public class City extends Destiny{

    public City(String nama, int jarak, int biayaTransportasi, int biayaAkomodasi) {
        super(nama,jarak,biayaTransportasi,biayaAkomodasi);
    }

    public int hitungBiayaTransportasi(){
        if (getJarak() > 500) { // jarak
            return (int) ((getBiayaAkomodasi() + getBiayaTransportasi()) * 0.03);
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
