public class KeretaApi {
    public String kodeKereta;
    public String namaKereta;
    public String rutePerjalanan;
    public int kursiKosong;

    KeretaApi (String namaKereta, String kodeKereta, String rutePerjalanan, int kursiKosong){
        this.namaKereta = namaKereta;
        this.kodeKereta = kodeKereta;
        this.rutePerjalanan = rutePerjalanan;
        this.kursiKosong = kursiKosong;
    }

    public void kurangiKursi(int jumlah){
        this.kursiKosong -= jumlah;
    }
}
