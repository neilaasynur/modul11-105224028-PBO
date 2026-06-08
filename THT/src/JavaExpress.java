import java.util.*;

public class JavaExpress {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Reservasi kontroler = new Reservasi();
        boolean mulai = true;

        while (mulai){
            System.out.println(" === MENU UTAMA ===");
            System.out.println("1. Lihat jadwal kereta");
            System.out.println("2. Pesan tiket kereta");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");

            try {
                int pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        for (KeretaApi list : kontroler.getDaftarKereta()){
                            System.out.println("\n==================");
                            System.out.println("Kode Kereta: " + list.kodeKereta);
                            System.out.println("Nama Kereta: " + list.namaKereta);
                            System.out.println("Rute Perjalanan: " + list.rutePerjalanan);
                            System.out.println("Kursi Kosong Tersedia: " + list.kursiKosong + " kursi");
                            System.out.println("==================");
                        }
                        break;
                        
                    case 2:
                        System.out.println("Input kode kereta: ");
                        String kode = input.nextLine().trim();

                        System.out.println("Input NIK: ");
                        String nik = input.nextLine().trim();

                        System.out.println("Nama penumpang: ");
                        String nama = input.nextLine().trim();

                        System.out.println("Jumlah Tiket: ");
                        int jumlahTiket = input.nextInt();
                        input.nextLine();

                        kontroler.pesanTiket(kode, nik, nama, jumlahTiket);
                        break;

                    case 3:
                        mulai = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(" >> error: inputan salah! Masukkan angka yang valid!");
            } catch (DataPenumpangTidakValidException e){
                System.out.println(e.getMessage());
            } catch (RuteTidakDitemukanException e){
                System.out.println(e.getMessage());
            } catch (TiketHabisException e){
                System.out.println(e.getMessage());
            } finally{
                if (!mulai){
                    System.out.println("Terimakasih telah menggunakan sistem Java Express!");
                    input.close();
                }
            }
        }
    }
}
