import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + new Date() + " #" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        return logger == null
                ? logger = new Logger()
                : logger;
    }
}