package com.backend.demo.Entity;


import com.backend.demo.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;




    private String email;



    private String password;


    private UserRole role;


    @Lob
    @Column(columnDefinition = "longblob")
    private Byte[] img ;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)


    private
    List<Order> orders;
}
