/**
 * Created by tenghuanhe on 2015/10/18.
 */
public class VariableParamTest {
    public static void main(String[] args) {
        Integer n = 10;
        System.out.printf("%d\n", n);
        System.out.printf("%d %s\n", new Object[]{new Integer(10), "Widgets"});

        double m = max(1, 2, 3, 4, 2, 6, 10, 7);
        System.out.println(m);
    }

    public static double max(double... values) {
        double largest = Double.MIN_VALUE;
        for (double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }
}
