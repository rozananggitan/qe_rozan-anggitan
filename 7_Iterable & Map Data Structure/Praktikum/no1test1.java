import java.util.*;
public class no1test1 {
    public static void main(String[] args) {
        List<String> nama1 = new ArrayList<String>();
        nama1.add("kazuya");
        nama1.add("jin");
        nama1.add("lee");
        List<String> nama2 = new ArrayList<String>();
        nama2.add("kazuya");
        nama2.add("feng");

        Set<String> set = new LinkedHashSet<>(nama1);
        set.addAll(nama2);

        List<String> output = new ArrayList<>(set);
        System.out.println(output);
    }
}