package propertySource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);
        PropertyClass propertyClass = context.getBean(PropertyClass.class);

        System.out.println(propertyClass.getHost());
        System.out.println(propertyClass.getEmail());
        System.out.println(propertyClass.getPassword());

        System.out.println("=====================================================================");

        System.out.println(propertyClass.getEhost());
        System.out.println(propertyClass.getEemail());
        System.out.println(propertyClass.getEpassword());

        System.out.println("=====================================================================");

        System.out.println(propertyClass.getThost());
        System.out.println(propertyClass.getTemail());
        System.out.println(propertyClass.getTpassword());
    }
}
