package my.project.ecommerce.dao.interfaces;

import my.project.ecommerce.models.User;

import java.util.List;

public interface IUserDao {
    List<User> getAllUsers();
}
