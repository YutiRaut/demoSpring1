package postConstructAndPreDestroyed.loggerExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import postConstructAndPreDestroyed.beanExample.MyConfiguration;

public class LoggerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LoggerConfig.class);

        //Logger logger= ctx.getBean("log",Logger.class);
        //Logger logger= ctx.getBean("loggers",Logger.class);

        Logger logger= ctx.getBean(Logger.class);
        logger.logMessage("log-in kr raha hei");
        System.out.println(logger.hashCode());

        System.out.println("=================================================");
        Logger logger1= ctx.getBean(Logger.class);
        logger1.logMessage(" phir log-in kr raha hei ");
        System.out.println(logger1.hashCode()+"\n");



ctx.close();


    }
}
