package postConstructAndPreDestroyed.beanExample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {

    public MyBean() {
        System.out.println("MyBean instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Verifying Resources");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("Shutdown All Resources");
    }

    public void close() {
        System.out.println("Closing All Resources");
    }
}