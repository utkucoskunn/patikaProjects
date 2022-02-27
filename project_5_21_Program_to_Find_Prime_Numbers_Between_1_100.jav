import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {

        int start = 2;
        int end = 100;

        for (int i = start; i < end; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }

    }
}
