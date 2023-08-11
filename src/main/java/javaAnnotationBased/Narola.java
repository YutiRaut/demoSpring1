package javaAnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Narola {
    public static void main(String[] args) {

        ApplicationContext factory= new AnnotationConfigApplicationContext(Company.class);



        Department department = factory.getBean(Department.class);
        department.tech();
    }
}
