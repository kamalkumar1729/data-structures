package learnjava.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slfwithlog4j {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(slfwithlog4j.class);
        int age = 26;
        logger.info("kamal is {} year old ", age);
    }
}
