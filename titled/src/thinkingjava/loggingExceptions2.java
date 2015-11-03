package thinkingjava;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2015/11/3.
 */
public class loggingExceptions2 {
    private static Logger logger = Logger.getLogger("LoggingException2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new ExtraException(42, "Hello");
        } catch (ExtraException e) {
            logException(e);
        }
    }
}

class ExtraException extends Exception {
    private int x;
    private String msg;

    public ExtraException() {
    }

    public ExtraException(int x, String msg) {
        this.x = x;
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return "Detailed messages: x = " + x + " mymsg = " + msg + "\n" + super.getMessage();
    }
}
