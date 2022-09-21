package singleton;

public class Logger {

    private static final Logger instance = new Logger();

    private Logger(){}

    public static Logger getInstance(){
        return instance;
    }

    public static void info(String message) {
        System.out.println("[INFO] " + message);
    }
}
