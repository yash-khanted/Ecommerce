package my.project.ecommerce.repositories;

import my.project.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
