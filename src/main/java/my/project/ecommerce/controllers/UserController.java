package my.project.ecommerce.controllers;

import my.project.ecommerce.models.User;
import my.project.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/{userId}")
    public User getUser(@RequestParam Integer userId){
        return null;
    }

    @PostMapping
    public ResponseEntity<String> postUser(@RequestBody User userDto) {
        try {
            String sessionToken = userService.fetchSessionToken(userDto.getEmailAddress(), userDto.getPassword());
            return new ResponseEntity<>(sessionToken, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>("user not found", HttpStatus.BAD_REQUEST);
        }
    }
}
