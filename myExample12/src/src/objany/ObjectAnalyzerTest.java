package src.objany;

import java.util.ArrayList;

/**
 * Created by tenghuanhe on 2015/10/18.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < 5; i++) squares.add(i * i);

        System.out.println(new ObjectAnalyzer().toString(squares));


    }
}
