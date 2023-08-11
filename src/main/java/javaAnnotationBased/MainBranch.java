package javaAnnotationBased;


import org.springframework.stereotype.Component;

@Component
//@Primary
public class MainBranch implements Branch{
    @Override
    public void branchName() {
        System.out.println(" Main Branch is Surat");
    }
}
