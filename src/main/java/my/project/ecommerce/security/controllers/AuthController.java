package my.project.ecommerce.security.controllers;

import my.project.ecommerce.security.services.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {
    private final AuthService authService;
    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @GetMapping(path = "login")
    public void login(){
        authService.generateJwtToken();
    }
    @PostMapping(path = "/logout")
    public void logout(){

    }
    @PostMapping("/register")
    public void register(){

    }
}
