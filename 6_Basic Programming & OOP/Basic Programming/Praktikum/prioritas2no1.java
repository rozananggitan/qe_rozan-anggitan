public class prioritas2no1 {
    public static void main(String[] args) {
        int height = 5;
        int length = 5;
        int count = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                if (count % 3 == 0) {
                    System.out.print("X ");
                } else if (count % 2 == 1) {
                    System.out.print("Y ");
                } else {
                    System.out.print("Z ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
