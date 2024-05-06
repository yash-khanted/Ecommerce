package my.project.ecommerce.services;

import my.project.ecommerce.models.User;

public interface IUserService {
    String saveUser(User user);
    String fetchSessionToken(String emailAddress, String password);
    boolean validateSession(String sessionToken);
    void changePassword(String oldPassword, String newPassword);
}
