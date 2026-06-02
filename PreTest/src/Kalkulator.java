import java.util.*;

public class Kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input angka pembilang: ");
            double pembilang = input.nextDouble();

            System.out.print("Input angka penyebut: ");
            double penyebut = input.nextDouble();
            
            double hasil = pembilang / penyebut;
            System.out.println("Hasil dari pembagian " + pembilang + " dengan " + penyebut + " adalah = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println(" >> error: tidak boleh melakukan pembagian dengan angka 0!");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println(" >> error: inputan harus berupa angka!");
            // System.out.println(e.getMessage());
        } finally{
            input.close();
            System.out.println("Proses kalkulasi selesai dan resource memori telah dibersihkan");
        }

    }
}
