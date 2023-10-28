package flight.modal;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String email;
    private String name;
    private Integer age;
    private String address;
    private String gender;

    @Column(nullable = false)
    private String password;
    private String role;
    private boolean status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

}
