package postConstructAndPreDestroyed.beanExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import postConstructAndPreDestroyed.beanExample.MyBean;
import postConstructAndPreDestroyed.beanExample.MyConfiguration;

public class MySpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfiguration.class);
        ctx.refresh();

        MyBean mb1 = ctx.getBean(MyBean.class);
        System.out.println(mb1.hashCode());

        MyBean mb2 = ctx.getBean(MyBean.class);
        System.out.println(mb2.hashCode());

        MyBean mb3 = ctx.getBean(MyBean.class);
        System.out.println(mb3.hashCode());

//        MyBean prototypeBean = ctx.getBean(MyBean.class);
//        prototypeBean.init();
//        System.out.println(prototypeBean.hashCode());
//        prototypeBean.shutdown();
        ctx.close();
    }

}
