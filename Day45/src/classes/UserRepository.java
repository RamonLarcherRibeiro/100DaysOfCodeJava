package classes;

import java.util.List;

public interface UserRepository {
    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(Long id);
}
