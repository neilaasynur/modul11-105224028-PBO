public class MesinKasir {
    public void bayar(int totalBelanja, int uangDiberikan) throws UangKurangException{
        if (uangDiberikan < totalBelanja){
            throw new UangKurangException("Uang yang Anda berikan tidak cukup!");
        }
    }
}
