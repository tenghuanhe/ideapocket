package quicksort;

/**
 * Created by tenghuanhe on 2015/10/27.
 */
public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(-100));
        System.out.println(reverse(0));
        System.out.println(reverse(10111));
        System.out.println(reverse(100));
        System.out.println(reverse(21403));
    }

    public static String reverse(int num) {
        if (num < 0)
            return "-" + reverse(-num);
        if (num < 10)
            return Integer.toString(num);
        else
            return Integer.toString(num % 10) + reverse(num / 10);
    }
}
