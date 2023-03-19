import java.util.*;
public class no1test2 {
    public static void main(String[] args) {
        List<String> nama1 = new ArrayList<String>();
        nama1.add("lee");
        nama1.add("jin");
        List<String> nama2 = new ArrayList<String>();
        nama2.add("kazuya");
        nama2.add("panda");

        Set<String> set = new LinkedHashSet<>(nama1);
        set.addAll(nama2);

        List<String> output = new ArrayList<>(set);
        System.out.println(output);
    }
}