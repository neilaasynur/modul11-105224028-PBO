import java.util.*;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        double[] hargaMenu = new double[3];

        for (int i = 0; i <= 3; i++){
            try {
                System.out.print("Harga Menu ke-" + (i+1) +": Rp");
                hargaMenu[i] = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(" >> error: input harga harus berupa angka!");
                input.nextLine();
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" >> error: kapasitas memori harga sudah penuh!");
            }
        }

        Pelanggan pelanggan1 = new Pelanggan("neii");
        try {
            pelanggan1.daftarMember(15);
        } catch (Exception e) {
            System.out.println(" >> error: " + e.getMessage());
        }

        try {
            pelanggan1.pesanKopi(10);
        } catch (Exception e) {
            System.out.println(" >> error: " + e.getMessage());
        }

        MesinKasir mesinKasir = new MesinKasir();
        try {
            mesinKasir.bayar(50000, 30000);
        } catch (Exception e) {
            System.out.println(" >> error: " + e.getMessage());
        }

        try{
            mesinKasir.cetakStruk(false);
        } catch (Exception e){
            System.out.println(" >> error: " + e.getMessage());
        } finally{
            System.out.println("Terima kasih telah berkunjung ke Cafe Jaav Bean. Program kasis ditutup!");
        }
    }
}
