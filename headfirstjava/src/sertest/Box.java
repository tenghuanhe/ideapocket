package sertest;

import java.io.Serializable;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}
