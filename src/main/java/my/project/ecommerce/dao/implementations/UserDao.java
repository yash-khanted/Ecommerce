package my.project.ecommerce.dao.implementations;

import my.project.ecommerce.dao.interfaces.IUserDao;
import my.project.ecommerce.models.User;
import my.project.ecommerce.repositories.IUserRepository;

import java.util.List;

public class UserDao implements IUserDao {
    private IUserRepository userRepository;

    public UserDao(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
