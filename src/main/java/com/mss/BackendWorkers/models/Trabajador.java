package com.mss.BackendWorkers.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Trabajador {
    @Id
    private String dni;

    private String nombres;
    private String apellidos;

    @OneToMany(mappedBy = "trabajador", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Foto> fotos;
}
