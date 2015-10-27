package ball2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tenghuanhe on 2015/10/26.
 */
public class BonuceThread {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class BallRunnale implements Runnable {

    public static final int STEPS = 100000;
    public static final int DELAY = 5;
    private Ball ball;
    private Component component;

    public BallRunnale(Ball aBall, Component aComponent) {
        ball = aBall;
        component = aComponent;
    }

    @Override
    public void run() {
        for (int i = 0; i < STEPS; i++) {
            ball.move(component.getBounds());
            component.repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BounceFrame extends JFrame {
    private BallComponent comp;

    public BounceFrame() {
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        addButton(buttonPanel, "Start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });

        addButton(buttonPanel, "Close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(buttonPanel, BorderLayout.SOUTH);
        pack();

    }

    public void addButton(Container c, String title, ActionListener listener) {
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall() {
        Ball ball = new Ball();
        comp.add(ball);
        Ball b = new Ball();
        comp.add(b);
        Runnable r = new BallRunnale(b, comp);
        Thread t = new Thread(r);
        t.start();
    }
}

