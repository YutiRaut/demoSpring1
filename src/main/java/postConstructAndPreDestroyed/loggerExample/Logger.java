package postConstructAndPreDestroyed.loggerExample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Logger {

        @PostConstruct
        public void init() {
            // Initialize the logger
            System.out.println("Logger aya.");
        }

        public void logMessage(String message) {
            // Log the message
            System.out.println("Logging: " + message);
        }

        @PreDestroy
        public void close() {
            // Close the logger and perform any necessary cleanup
            System.out.println("Logger ja raha hei...bye");
        }
    }


