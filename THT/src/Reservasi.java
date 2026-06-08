import java.util.*;

public class Reservasi {
    private List<KeretaApi> daftarKereta;
    private List<PesanTiket> riwayatTransaksi;

    public Reservasi(){
        daftarKereta = new ArrayList<>();
        riwayatTransaksi = new ArrayList<>();
        dataAwal();
    }

    private void dataAwal(){
        daftarKereta.add(new KeretaApi("Argo Bromo", "K01", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("Parahyangan", "K02", "JKT - BDG", 15));
    }

    public List<KeretaApi> getDaftarKereta(){
        return daftarKereta;
    }
    public List<PesanTiket> getRiwayatTransaksi(){
        return riwayatTransaksi;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket)throws RuteTidakDitemukanException, TiketHabisException{
        if (nik.length() != 16 || !nik.matches("[0-9]+")){
            throw new DataPenumpangTidakValidException(" >> error: NIK harus berisi tepat 16 angka!");
        }

        KeretaApi targetKereta = null;
        for (KeretaApi list : daftarKereta){
            if (list.kodeKereta.equalsIgnoreCase(kodeKereta)){
                targetKereta = list;
                break;
            }
        }

        if (targetKereta == null){
            throw new RuteTidakDitemukanException(" >> error: Rute perjalanan tidak ditemukan!");
        }

        if (jumlahTiket > targetKereta.kursiKosong){
            throw new TiketHabisException(" >> error: Maaf kursi kosong tidak tersedia!", targetKereta.namaKereta, targetKereta.kursiKosong);
        }

        targetKereta.kurangiKursi(jumlahTiket);
        riwayatTransaksi.add(new PesanTiket(targetKereta.kodeKereta, nik, namaPenumpang, jumlahTiket));
    }
}
