package importAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportAnnotationConfigDemo {
    public static void main(String[] args) {
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(ImportBeansConfig.class);
        ExampleBean exampleBean = ctxt.getBean(ExampleBean.class);
        SampleBean sampleBean = ctxt.getBean(SampleBean.class);

        exampleBean.printObjects();
        sampleBean.printObjects();

    }
}
