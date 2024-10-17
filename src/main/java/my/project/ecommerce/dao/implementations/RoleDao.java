package my.project.ecommerce.dao.implementations;

import my.project.ecommerce.dao.interfaces.IRoleDao;
import my.project.ecommerce.models.Role;
import my.project.ecommerce.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleDao implements IRoleDao {
    @Autowired IRoleRepository roleRepository;
    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> fetchRole() {
        return (List<Role>) roleRepository.findAll();
    }
}
