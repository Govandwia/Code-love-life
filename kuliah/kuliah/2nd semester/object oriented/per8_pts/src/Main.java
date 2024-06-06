public class Main {
    public static void main(String[] args)   {
        Tetap pegawai1 = new Tetap("Govan Dwi ADitya", "manager", 550, 20);
        TidakTetap pegawai2 = new TidakTetap("Poernomo Maulana Rofif Aqila", "Staff IT", 550);
        ParuhWaktu pegawaiPw = new ParuhWaktu("Muhammad Irfan Valerian", "Sekertaris", 0, 60, 10.00);


        // ganti to string
        System.out.println(pegawai1);
        System.out.println(pegawai2);
        System.out.println(pegawaiPw);

        // 
        if (pegawai1.getTakeHomePay() > pegawai2.getTakeHomePay() && pegawai1.getTakeHomePay() > pegawaiPw.getTakeHomePay()){
            System.out.println("Pegawai dengan Take Home Pay tertinggi : " + pegawai1.getNama() + " dengan sebesar " + pegawai1.getTakeHomePay());
        } else if (pegawai2.getTakeHomePay() > pegawai1.getTakeHomePay() && pegawai2.getTakeHomePay() > pegawaiPw.getTakeHomePay()) {
            System.out.println("Pegawai dengan Take Home Pay tertinggi : " + pegawai2.getNama() + " dengan sebesar " + pegawai2.getTakeHomePay());
        } else if (pegawaiPw.getTakeHomePay() > pegawai1.getTakeHomePay() && pegawaiPw.getTakeHomePay() > pegawai2.getTakeHomePay()) {
            System.out.println("Pegawai dengan Take Home Pay tertinggi : " + pegawaiPw.getNama() + " dengan sebesar " + pegawaiPw.getTakeHomePay());
        }
        System.out.println("------------------------------");
    }
}
