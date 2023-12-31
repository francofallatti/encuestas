package com.project.encuestabackend.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private  String name;

    @Column(nullable = false, length = 255)
    private  String email;

    @Column(nullable = false, length = 255)
    private  String encryptedPassword;
}
