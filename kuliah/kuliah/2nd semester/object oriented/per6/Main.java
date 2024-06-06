package per6;

public class Main {
    public static void main(String[] args) {
        Sheep domba = new Sheep("hitam", 4);
        domba.tidur();
        System.out.println(domba.warna);

        Cow sapi = new Cow("abu abut", 3);
        sapi.tidur();
        domba.suara();
        sapi.suara(3);
    }
}
