package per5contoh;

// import java.time.DayOfWeek;

public class contoh2 {
    public static void main(String[] args) {
        DayOfWeek hari = DayOfWeek.Sabtu;
        System.out.println(hari.isWeekend());
        System.out.println(DayOfWeek.Selasa.isWeekend());
    }
    public enum DayOfWeek {
        Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu;
        public boolean isWeekend() {
            return this == Sabtu || this == Minggu;
        }
    }
}
