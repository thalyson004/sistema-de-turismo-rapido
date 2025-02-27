package com.turismorapidobackend.turismorapidobackend.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Entity
public class Turista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany(targetEntity = Roteiro.class, mappedBy = "turistas")
    Set<Roteiro> roteiros;

    @OneToOne(targetEntity = Client.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    Client client;

    public Turista(){

    }

    
}
