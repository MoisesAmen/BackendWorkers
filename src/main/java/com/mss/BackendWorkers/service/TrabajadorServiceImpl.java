package com.mss.BackendWorkers.service;

import com.mss.BackendWorkers.models.Trabajador;
import com.mss.BackendWorkers.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorServiceImpl implements TrabajadorService {

    @Autowired
    private TrabajadorRepository repository;

    @Override
    public List<Trabajador> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Trabajador guardar(Trabajador trabajador) {
        return repository.save(trabajador);
    }

    @Override
    public Trabajador obtenerPorDni(String dni) {
        return repository.findById(dni).orElse(null);
    }

    @Override
    public void eliminar(String dni) {
        repository.deleteById(dni);
    }
}
