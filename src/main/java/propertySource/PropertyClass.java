package propertySource;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyClass {

    @Value("${gmail.host}")
    private String host;

    @Value("${gmail.email}")
    private String email;

    @Value("${gmail.password}")
    private String password;

    @Value("${email.host}")
    private String thost;

    @Value("${email.email}")
    private String temail;

    @Value("${email.password}")
    private String tpassword;

    @Value("${mail.host}")
    private String ehost;

    @Value("${mail.email}")
    private String eemail;

    @Value("${mail.password}")
    private String epassword;


    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getEhost() {
        return ehost;
    }

    public String getEemail() {
        return eemail;
    }

    public String getEpassword() {
        return epassword;
    }

    public String getThost() {
        return thost;
    }

    public String getTemail() {
        return temail;
    }

    public String getTpassword() {
        return tpassword;
    }
}
