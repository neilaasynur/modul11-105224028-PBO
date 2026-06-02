import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        AkunBank akun1 = new AkunBank(12345678, 5000000, 0);
        AkunBank akun2 = new AkunBank(11223344, 10000000, 0);

        while (akun1.getSaldo() > 0 ){
            try {
                System.out.print("nominal untuk di tarik: Rp");
                double nominalTarik = input.nextDouble();
                akun1.tarikTunai(nominalTarik);
            } catch (SaldoTidakMencukupiException e){
                System.out.println(" >> error: " + e.getMessage());
            }

            try {
                System.out.print("nominal yang ingin di transfer: Rp");
                double nominalTransfer = input.nextDouble();
                akun1.transfer(akun2, nominalTransfer);
            } catch (SaldoTidakMencukupiException e){
                System.out.println(" >> error: " + e.getMessage());
            } catch (BatasTransferHarianException e) {
                System.out.println(" >> error: " + e.getMessage());
            } finally {
                System.out.println(" Sesi transaksi ATM Anda telah diakhiri. Kartu dikembalikan otomatis.");
            }
        }

    }
}
