import java.util.*;
public class no2test1 {
    public static void main(String[] args) {
        String input = "7 6 5 2 3 7 5 2";
        List<String> inputangka = Arrays.asList(input.split(" "));
        Set<String> angkaSet = new HashSet<>(inputangka);
        List<String> angkaList = new ArrayList<>(angkaSet);
        List<String> outputList = new ArrayList<>();

        for (String angka : angkaList){
            if (inputangka.indexOf(angka) == inputangka.lastIndexOf(angka)){
                outputList.add(angka);
            }
        }
        System.out.println(outputList);
    }
}
