package javalearn.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class JavaLogs {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(JavaLogs.class.getName());

        /* to append logs to a file */
        FileHandler handler = new FileHandler("JUL_Logs.xml");

        logger.addHandler(handler);
        logger.info("kamal is here");

        logger.severe("kamal is not here");
    }
}
