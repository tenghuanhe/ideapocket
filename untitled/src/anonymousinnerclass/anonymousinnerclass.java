package anonymousinnerclass;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Administrator on 2015/10/19.
 */
class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Q?");
        System.exit(0);
    }
}

class TalkingClock {
    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval, listener);
        t.start();
    }
}
