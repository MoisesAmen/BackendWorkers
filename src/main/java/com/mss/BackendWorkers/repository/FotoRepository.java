package com.mss.BackendWorkers.repository;

import com.mss.BackendWorkers.models.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FotoRepository extends JpaRepository<Foto, Long> {
    List<Foto> findByTrabajadorDni(String dni);
}
