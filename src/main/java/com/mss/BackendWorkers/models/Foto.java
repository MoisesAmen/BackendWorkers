package com.mss.BackendWorkers.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ruta;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "trabajador_dni", nullable = false)
    @JsonIgnore
    private Trabajador trabajador;
}
