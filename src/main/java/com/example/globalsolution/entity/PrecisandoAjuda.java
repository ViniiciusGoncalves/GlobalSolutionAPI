package com.example.globalsolution.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PrecisandoAjuda extends User{
    @Column(name = "atividades")
    private String atividades;
    @Column(name = "familia_ajudadas")
    private String familiaAjudada;
    @Column(name = "representantes")
    private String representantes;
    @Column(name = "cep")
    private String cep;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "bairro")
    private String bairro;
}
