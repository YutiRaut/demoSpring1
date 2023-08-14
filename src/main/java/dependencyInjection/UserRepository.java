package dependencyInjection;

public class UserRepository {

    public User getUserById(int id) {
        return new User("user" + id);
    }

}
