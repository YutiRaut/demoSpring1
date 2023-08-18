package prosourceUsingEnvObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EvePropertyClass {

    @Autowired
    private Environment environment;

    private String host;
    private String email;
    private String password;
    private String ehost;
    private String eemail;
    private String epassword;
    private String thost;
    private String temail;
    private String tpassword;

    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    public String getEhost() {
        return environment.getProperty("mail.host");
    }

    public String getEemail() {
        return environment.getProperty("mail.email");
    }

    public String getEpassword() {
        return environment.getProperty("mail.password");
    }

    public String getThost() {
        return environment.getProperty("email.host");
    }

    public String getTemail() {
        return environment.getProperty("email.email");
    }

    public String getTpassword() {
        return environment.getProperty("email.password");
    }
}


