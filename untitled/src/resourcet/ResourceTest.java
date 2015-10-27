package resourcet;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/19.
 */
public class ResourceTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ResourceTestFrame();
                frame.setTitle("ResourceTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class ResourceTestFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 300;

    public ResourceTestFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        URL aboutUrl = getClass().getResource("about.gif");
        Image img = new ImageIcon(aboutUrl).getImage();
        setIconImage(img);

        JTextArea textArea = new JTextArea();
        InputStream stream = getClass().getResourceAsStream("about.txt");
        Scanner in = new Scanner(stream);

        while (in.hasNext())
            textArea.append(in.nextLine() + "\n");
        add(textArea);
    }
}
