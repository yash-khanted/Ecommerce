package my.project.ecommerce.services;

import my.project.ecommerce.dao.interfaces.IRoleDao;
import my.project.ecommerce.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired IRoleDao roleDao;
    public Role createRole(Role role){
        return roleDao.saveRole(role);
    }

    public List<Role> fetchRoles() {
        return roleDao.fetchRole();
    }
}
