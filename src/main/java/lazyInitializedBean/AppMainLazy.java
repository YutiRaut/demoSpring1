package lazyInitializedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMainLazy {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationOne applicationOne = context.getBean(ApplicationOne.class);
        applicationOne.ApplicationStatus();


    }
}
