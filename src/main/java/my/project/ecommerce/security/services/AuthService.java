package my.project.ecommerce.security.services;


import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
@Service
public class AuthService {
    Environment env;
    public AuthService(Environment env){
        this.env = env;
    }
    public void generateJwtToken(){
    }

    public void validate(String token, Long userId){

    }
}
