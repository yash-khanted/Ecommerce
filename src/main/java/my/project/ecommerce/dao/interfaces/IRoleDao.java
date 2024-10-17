package my.project.ecommerce.dao.interfaces;

import my.project.ecommerce.models.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRoleDao {
    Role saveRole(Role role);
    List<Role> fetchRole();
}
