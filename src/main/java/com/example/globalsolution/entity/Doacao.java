package com.example.globalsolution.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="table_doacao")
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "valor")
    private int valor;
    @Column(name = "valor_arrecadado")
    private int valorArrecadado;
}
