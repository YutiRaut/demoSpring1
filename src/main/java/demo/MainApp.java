package demo;

import demo.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring context using annotation configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the message service bean from the context
        MessageService messageService = context.getBean(MessageService.class);

        // Use the bean
        String message = messageService.getMessage();
        System.out.println(message);

        // Close the context
        context.close();
    }
}
