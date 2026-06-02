public class SaldoTidakMencukupiException extends Exception{
    private double saldoKurang;
    
    public SaldoTidakMencukupiException(String message, double saldoKurang){
        super(message);
        this.saldoKurang = saldoKurang;
    }

    public double getSaldoKurang(){
        return saldoKurang;
    }
}
