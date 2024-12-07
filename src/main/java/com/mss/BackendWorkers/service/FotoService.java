package com.mss.BackendWorkers.service;

import com.mss.BackendWorkers.models.Foto;

import java.util.List;

public interface FotoService {
    List<Foto> listarTodas();
    Foto guardar(Foto foto);
    Foto obtenerPorId(Long id);
    void eliminar(Long id);
    List<Foto> listarFotosPorTrabajador(String dni);

}
