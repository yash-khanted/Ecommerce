package my.project.ecommerce.controllers;

import my.project.ecommerce.models.User;
import my.project.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService service;
    @Autowired
    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping(path = "/{userId}")
    public User getUser(@RequestParam Integer userId){
        return service.fetchUserById(userId);
    }

    @PostMapping
    public User postUser(@RequestBody User user){
        return service.feedUser(user);
    }
}
