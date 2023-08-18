package importAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {

    @Autowired
    private GoldFish goldFish;

    @Autowired
    private Eagle eagle;

    @Autowired
    private Ostrich ostrich;

    public void printObjects() {
        System.out.println("---------- Print SampleBean Objects ----------");
        System.out.println(goldFish);
        System.out.println(eagle);
        System.out.println(ostrich);
    }

}