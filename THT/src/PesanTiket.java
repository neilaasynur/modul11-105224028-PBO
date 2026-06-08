public class PesanTiket {
    public String kodeKereta;
    private String nik;
    public String namaPenumpang;
    public int jumlahTiket;

    public PesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket){
        this.kodeKereta = kodeKereta;
        this.nik = nik;
        this.namaPenumpang = namaPenumpang;
        this.jumlahTiket = jumlahTiket;
    }

    public String getNik() {
        return nik;
    }
}
