import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class no5test2 {
    public static void main(String[] args) {
    Set<Integer> angka = new HashSet<>(Arrays.asList(2, 2, 2, 11));
    int length = angka.size();
    System.out.println(angka);
    System.out.println("Panjang Subarray adalah "+length);
}
}
