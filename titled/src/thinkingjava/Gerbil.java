package thinkingjava;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/11/5.
 */
public class Gerbil {
    private static int counter;
    private int gerbilNumber = counter++;

    public Gerbil() {
    }

    public void hop() {
        System.out.println("Gerbil " + this.gerbilNumber + " is hopping.");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }

        Gerbil gerbil = null;
        for (int i = 0; i < gerbils.size(); i++) {
            gerbil = gerbils.get(i);
            gerbil.hop();
        }

    }

}
