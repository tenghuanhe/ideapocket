package nowcoder;

/**
 * Created by Administrator on 2015/10/26.
 */
public class ReverseInt {
    public static void main(String[] args) {

        System.out.println(reverse(12209));
        System.out.println(reverse(0));
        System.out.println(reverse(-12209));
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
