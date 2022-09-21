package at.lecture.singleton;

import at.lecture.factory.App;

public class Main {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1);
        System.out.println(logger2);

        logger1.info("Hello");
    }
}