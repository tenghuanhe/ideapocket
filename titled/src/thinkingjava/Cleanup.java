package thinkingjava;

/**
 * Created by Administrator on 2015/11/4.
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("jobs.txt");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    System.out.println(s);
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
