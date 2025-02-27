package com.turismorapidobackend.turismorapidobackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
public class Atracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id_atracao;
    String name;
    Long tel_number;
    String endereco;
    String descricao;
    String tipo;

    @ManyToOne(targetEntity = Cidade.class)
    @JoinColumn(name = "cidade_id")
    Cidade cidade;

    public Atracao() {
    }
}
