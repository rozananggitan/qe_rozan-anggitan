import java.util.*;
public class no4test2 {
    public static void main(String[] args) {
        int[] angka1 = {3, 8};
        int[] angka2 = {2, 8};
        List<Integer> output = outputangka(angka1, angka2);
        System.out.println(output);
    }
    public static List<Integer> outputangka(int[] angka1, int[] angka2) {
        List<Integer> output = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : angka1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : angka2) {
            map.put(num, map.getOrDefault(num, 0) + 2);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                output.add(num);
            }
        }
        return output;
    }
}
