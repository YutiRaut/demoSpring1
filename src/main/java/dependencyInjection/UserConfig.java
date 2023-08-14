package dependencyInjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

//    @Bean
//    public UserService userService(UserRepository userRepository) {
//        return new UserService(userRepository);
//    }

    @Bean
    public UserService userService() {
        UserService userService = new UserService();
        userService.setUserRepository(userRepository());
        return userService;
    }
}
