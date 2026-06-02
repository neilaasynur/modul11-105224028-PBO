public class Pelanggan {
    String nama;
    int stokKopi = 5;
    
    Pelanggan(String nama){
        this.nama = nama;
    }

    public void daftarMember(int umur){
        if ( umur < 17){
            throw new IllegalArgumentException("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP");
        }
    }

    public void pesanKopi(int jumlahPesanan){
        if (jumlahPesanan > stokKopi){
            KopiHabisException e = new KopiHabisException("Stok kopi tidak mencukupi!");
            throw e;
        } else {
            stokKopi -= jumlahPesanan;
            System.out.println("Pesanan kopi berhasil dibuat!");
        }
    }
}
