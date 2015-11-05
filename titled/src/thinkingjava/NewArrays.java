package thinkingjava;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2015/11/5.
 */
public class NewArrays {
    public static void main(String[] args) {
        Integer[][] a = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 3, 5, 2, 5, 6, 8, 10},
                {10, 11, 12, 14, 45, 67, 43}
        };

        System.out.println(Arrays.deepToString(a));


        Random rand = new Random(47);
        int[][][] b = new int[rand.nextInt(7)][][];
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            b[i] = new int[rand.nextInt(9)][];
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(j);
                b[i][j] = new int[rand.nextInt(3)];
            }
        }

        System.out.println(Arrays.deepToString(b));
    }

}
