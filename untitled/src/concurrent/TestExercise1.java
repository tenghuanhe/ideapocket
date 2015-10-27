package concurrent;

/**
 * Created by Administrator on 2015/10/23.
 */
public class TestExercise1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Exercise1()).start();
        }
    }
}
