package innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Administrator on 2015/10/19.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimerPrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (TalkingClock.this.beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}
