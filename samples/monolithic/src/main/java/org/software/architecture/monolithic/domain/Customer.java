package org.software.architecture.monolithic.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Date birthday;
    private String phone;
    private String email;
    private String gender;
    private String martialStatus;
    private Double creditLimit;


}
