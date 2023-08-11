package javaAnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Department {

    @Autowired
    @Qualifier("secondaryBranch")
            //it is used when you not specify @primary so you can use this as per your requirement
Branch location;

    public Branch getLocation() {
        return location;
    }

    public void setLocation(Branch location) {
        this.location = location;
    }

    public void tech(){
        System.out.println("Technologies:- JAVA,PHP,ASP.net,ReactNative");
        location.branchName();
    }
}
