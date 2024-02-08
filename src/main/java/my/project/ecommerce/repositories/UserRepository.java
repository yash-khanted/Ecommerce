package my.project.ecommerce.repositories;

import my.project.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer userId);
    List<User> findAll();
    User save(User newUser);
}
