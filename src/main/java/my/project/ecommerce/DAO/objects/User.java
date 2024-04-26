package my.project.ecommerce.DAO.objects;

import lombok.Data;
import my.project.ecommerce.models.Address;

@Data
public class User {
    private int id;
    private String email;
    private String username;
    private String password;
    private Address address;
    private String phone;
}
