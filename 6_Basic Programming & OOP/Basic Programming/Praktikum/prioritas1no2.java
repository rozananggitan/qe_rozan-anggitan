import java.util.Scanner;
public class prioritas1no2 {
    public static void main(String[] args) {
        int hargaBeli = 0;
        int hargaJual = 0;
        int hasil = hargaBeli-hargaJual;
        String keterangan;
        Scanner harga = new Scanner(System.in);

        System.out.println("Masukan Harga Beli : ");
        hargaBeli = harga.nextInt( );
        System.out.println("Masukan Harga Jual : ");
        hargaJual = harga.nextInt( );

        if (hargaJual > hargaBeli){
            keterangan = ("Untung sebesar : " + (hargaJual-hargaBeli));
        } else if (hargaJual < hargaBeli) {
            keterangan = ("Rugi sebesar : " + (hargaJual-hargaBeli));
        }
        else
        {
            keterangan = "Sama Saja";
        }
        System.out.println(""+keterangan);
    }
}
