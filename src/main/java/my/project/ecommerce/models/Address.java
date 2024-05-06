package my.project.ecommerce.models;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String type;
    private String city;
    private String street;
    private String number;
    private String zipcode;
}
