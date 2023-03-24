package com.turismorapidobackend.turismorapidobackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Alimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_alimentacao;
    
    String local_name;
    String description;
    String phone_number;
    String street_name;
    String street_district;
    int street_number;

    @ManyToMany(targetEntity = Roteiro.class,
            mappedBy = "alimentacao"
            )
    List<Roteiro> roteiros;

    public Alimentacao(){
        
    }
}
