package my.project.ecommerce.controllers;

import my.project.ecommerce.models.Role;
import my.project.ecommerce.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/role")
public class RoleController {
    RoleService roleService;
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public HttpEntity<List<Role>> getAllRoles(){
        return ResponseEntity.ok(roleService.fetchRoles());
    }
    @PostMapping(path = "/register")
    public HttpEntity registerNewRole(@RequestParam String roleName, @RequestParam String roleDescription){
        return ResponseEntity.ok().build();
    }
}
