package test;

import javafx.print.Printer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2015/10/23.
 */
public class Test2 {
    static int x = 10;

    static {
        x += 5;
    }

    public static void main(String[] args) throws IOException //4
    {
        System.out.println("x=" + x);
        ServerSocket s = new ServerSocket(8189);
        Socket incoming = s.accept();

        InputStream inStream = incoming.getInputStream();
        OutputStream outStream = incoming.getOutputStream();

        Scanner in = new Scanner(inStream);
        PrintWriter out = new PrintWriter(outStream, true);

        out.println("Hello! Enter BYE to exit.");

        boolean done = false;
        while (!done && in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
            out.println("Echo: " + line);
            if (line.trim().equals("BYE"))
                done = true;
        }
        incoming.close();
    }

    static {
        x /= 3;
    }
}
