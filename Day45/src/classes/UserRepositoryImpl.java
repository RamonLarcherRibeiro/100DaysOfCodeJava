package classes;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public User findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        int index = users.indexOf(findById(user.getId()));
        if (index >= 0) {
            users.set(index, user);
        }
    }

    @Override
    public void delete(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
