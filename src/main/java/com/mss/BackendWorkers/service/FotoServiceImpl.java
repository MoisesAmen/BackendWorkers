package com.mss.BackendWorkers.service;

import com.mss.BackendWorkers.models.Foto;
import com.mss.BackendWorkers.repository.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoServiceImpl implements FotoService {

    @Autowired
    private FotoRepository repository;

    @Override
    public List<Foto> listarTodas() {
        return repository.findAll();
    }

    @Override
    public Foto guardar(Foto foto) {
        return repository.save(foto);
    }

    @Override
    public Foto obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Foto> listarFotosPorTrabajador(String dni) {
        return repository.findByTrabajadorDni(dni);
    }
}
