public class TiketHabisException extends Exception{
    public String namaKereta;
    public int kursiKosong;
    
    public TiketHabisException (String message, String namaKereta, int kursiKosong){
        super(message);
        this.namaKereta = namaKereta;
        this.kursiKosong = kursiKosong;
    }
}
