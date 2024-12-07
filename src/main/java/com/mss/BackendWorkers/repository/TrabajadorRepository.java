package com.mss.BackendWorkers.repository;

import com.mss.BackendWorkers.models.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabajadorRepository extends JpaRepository<Trabajador, String> {
}
