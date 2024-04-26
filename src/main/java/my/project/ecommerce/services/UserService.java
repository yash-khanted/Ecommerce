package my.project.ecommerce.services;

import my.project.ecommerce.models.User;
import my.project.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository repository){
        userRepository = repository;
    }
    public List<User> fetchAllUsers(){
        return userRepository.findAll();
    }

    public User feedUser(User user){
        return userRepository.save(user);
    }

    public User fetchUserById(Integer userId){
        return userRepository.findUserById(userId);
    }
}
