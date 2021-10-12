package src.main.java.com.github.ticketGrab;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogManager().getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        logger.info("================tool start================");
        if (args.length > 0 && "-c".equals(args[0].toLowerCase())) {

        } else {

        }
        logger.info("================tool stop================");
    }
}