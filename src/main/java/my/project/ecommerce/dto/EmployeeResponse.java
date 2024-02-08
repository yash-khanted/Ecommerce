package my.project.ecommerce.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class EmployeeResponse {
    private String empId;
    private String jobTitleName;
    private String firstName;
    private String lastName;
    private String preferredFullName;
    private String employeeCode;
    private String region;
    private String phoneNumber;
    private String emailAddress;
}
