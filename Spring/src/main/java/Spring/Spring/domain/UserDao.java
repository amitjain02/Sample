package Spring.Spring.domain;

public interface UserDao {
    User getForUsername(String username);

    void createUser(User user);
}