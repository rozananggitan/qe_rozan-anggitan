public class calculator {
    public static void main(String[] args) {
        int penjumlahan = penjumlahan(3,4);
        int pengurangan = pengurangan(15, 4);
        int perkalian = perkalian(10, 10);
        int pembagian = pembagian(12, 3);

        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Perkalian: " + perkalian);
        System.out.println("Hasil Pembagian: " + pembagian);
    }
    public static int penjumlahan(int a, int b) {
        return a + b;
    }
    public static int pengurangan(int a, int b) {
        return a - b;
    }
    public static int perkalian(int a, int b) {
        return a * b;
    }
    public static int pembagian(int a, int b) {
        return a / b;
    }
    }
