package dependencyInjection;

public class UserService {
    private  UserRepository userRepository;
//Constructor
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserUsername(int userId) {
        User user = userRepository.getUserById(userId);
        return user.getUsername();
    }
}
