public class AkunBank {
    private int nomorRekening;
    private double saldo;
    private double totalTransferHariIni;

    public AkunBank(int nomorRekening, double saldo, double totalTransferHariIni){
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException{
        if (saldo < nominal){
            throw new SaldoTidakMencukupiException(" >> saldo tidak cukup untuk di tarik tunai!", this.getSaldo() - nominal);
        } else {
            saldo -= nominal;
            System.out.println(" >> transaksi berhasil dilakukan!");
            System.out.println("Saldo saat ini: Rp" + saldo);
        }
    }

    public void  transfer(AkunBank tujuan, double  nominal)throws SaldoTidakMencukupiException, BatasTransferHarianException{
        if (totalTransferHariIni + nominal > 10000000){
            throw new BatasTransferHarianException(" >> limit transfer harian!");
        } else if (saldo < nominal){
            throw new SaldoTidakMencukupiException(" >> saldo tidak cukup untuk di transfer!", this.getSaldo() - nominal);
        } else {
            saldo -= nominal;
            tujuan.saldo += nominal;
            totalTransferHariIni += nominal;
            System.out.println(" >> Transaksi transfer berhasil dilakukan!");
            System.out.println("Saldo saat ini: Rp" + saldo);
        }
    }
}
