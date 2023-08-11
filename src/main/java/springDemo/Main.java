package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


//      //this is for xml based configuration
//    Library scan =(Library) context.getBean("library");
//        //here in this we use the bean id to get the values
//    scan.read();


//    Library scan =(Library) context.getBean("book");
//    //in this we provide the class where we use annotation @component
//    scan.read();

////for adding property tag in bean
//        Genre genres = (Genre) context.getBean("genre");
//        System.out.println(genres);

//        Genre genres = (Genre) context.getBean("genre");
//       System.out.println(genres);


        Library obj = (Library) context.getBean("book");
        obj.read();

    }
}
