package my.project.ecommerce.security.services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
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
        //Creates a secret key
        SecretKey key = Jwts.SIG.HS256.key().build();
        System.out.println(key.getEncoded().toString());
    }

    public void validate(String token, Long userId){

    }
}
