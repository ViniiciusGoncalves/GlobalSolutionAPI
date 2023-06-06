package com.example.globalsolution.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="table_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String password;

    @Column(name = "cpfOuCnpj")
    private String cpfOuCnpj;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

}
