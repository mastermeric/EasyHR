package commencis.hr.EmployeeManagement.EmployeeService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;

 
 
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    //     public long getId() {
    //     return id;
    // }
   
 
    // @Column(name = "first_name", nullable = false)
    // public String getFirstName() {
    //     return firstName;
    // }
 

    // @Override
    // public String toString() {
    //     return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
    //    + "]";
    // }
}
