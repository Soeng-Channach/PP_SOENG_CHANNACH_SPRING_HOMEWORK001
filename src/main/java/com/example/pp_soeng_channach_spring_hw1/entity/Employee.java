package com.example.pp_soeng_channach_spring_hw1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
//    @Column(unique = true)
    private String email;
    @Transient
    private String temp;

    public Employee (String firstName,String lastName,Date birthDate,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.email=email;

    }
}
