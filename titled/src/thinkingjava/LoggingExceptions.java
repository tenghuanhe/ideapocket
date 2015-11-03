package thinkingjava;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2015/11/3.
 */
public class LoggingExceptions {

    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
            // 构造函数中调用了logger.sever(trace.toString())
            // 把日志记录到了logger里面
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

}
