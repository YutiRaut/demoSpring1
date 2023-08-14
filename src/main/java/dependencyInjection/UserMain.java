package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain{

    public static void main(String[] args) {
        // Create an application context using the AppConfig class
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        UserService userService = context.getBean(UserService.class);
        String username = userService.getUserUsername(1);
        System.out.println("Username: " + username);
    }
}

