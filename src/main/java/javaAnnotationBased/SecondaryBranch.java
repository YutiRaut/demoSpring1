package javaAnnotationBased;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class SecondaryBranch implements Branch{
    @Override
    public void branchName() {
        System.out.println("Nashik Branch");
    }
}
