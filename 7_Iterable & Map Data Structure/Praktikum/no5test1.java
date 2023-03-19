import java.util.*;
public class no5test1 {
    public static void main(String[] args) {
        Set<Integer> angka = new HashSet<>(Arrays.asList(2, 3, 3, 3, 6, 9, 9));
        int length = angka.size();
        System.out.println(angka);
        System.out.println("Panjang Subarray adalah "+length);
    }
}
