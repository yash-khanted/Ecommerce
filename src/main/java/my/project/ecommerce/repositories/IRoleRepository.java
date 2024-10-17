package my.project.ecommerce.repositories;

import my.project.ecommerce.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends CrudRepository<Role, Long> {
}
