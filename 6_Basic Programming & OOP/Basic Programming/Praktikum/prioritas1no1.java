public class prioritas1no1 {
    public static void main(String[] args) {
        //luas bangun datar segitiga
        float alas = 20;
        float tinggi = 25;
        float luasSegitiga = 0.5f * alas * tinggi;
        //luas bangun datar persegi panjang
        int panjang = 40;
        int lebar = 6;
        int luasPersegiPanjang = panjang * lebar;
        //luas bangun datar lingkaran
        double jari2 = 7;
        double phi = 3.14;
        double luasLingkaran = phi * jari2 * jari2;

        //keterangan hasil
        System.out.println("Luas segitiga adalah: " + luasSegitiga);
        System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);
        System.out.println("Luas lingkaran adalah :" + luasLingkaran);
    }
}
