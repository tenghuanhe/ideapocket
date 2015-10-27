package staticinnerclasstest;

import java.util.Date;

/**
 * Created by Administrator on 2015/10/19.
 */
public class StaticInnerClassTest {
    public static void main(String[] args) {

    }
}

class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return this.first;
        }

        public double getSecond() {
            return this.second;
        }
    }

    public static Pair minmax(double[] values) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double v : values) {
            if (v > max)
                max = v;
            if (v < min)
                min = v;
        }

        return new Pair(min, max);
    }
}
