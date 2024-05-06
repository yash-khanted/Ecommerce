package my.project.ecommerce.services;

import my.project.ecommerce.dao.implementations.UserDao;
import my.project.ecommerce.dao.interfaces.IUserDao;
import my.project.ecommerce.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    private IUserDao userDao;
    @Override
    public String saveUser(User user) {
        return null;
    }

    @Override
    public String fetchSessionToken(String emailAddress, String password) {
        return null;
    }

    @Override
    public boolean validateSession(String sessionToken) {
        return false;
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }
}
