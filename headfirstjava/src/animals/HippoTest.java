package animals;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class HippoTest {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Hippo h1 = new Hippo();

        Hippo h2 = new Hippo("Buffy");
        System.out.println(h2.getName());
    }
}
