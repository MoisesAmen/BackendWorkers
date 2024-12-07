package com.mss.BackendWorkers.service;

import com.mss.BackendWorkers.models.Trabajador;

import java.util.List;

public interface TrabajadorService {
    List<Trabajador> listarTodos();
    Trabajador guardar(Trabajador trabajador);
    Trabajador obtenerPorDni(String dni);
    void eliminar(String dni);
}
