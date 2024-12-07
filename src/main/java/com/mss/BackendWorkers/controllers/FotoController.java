package com.mss.BackendWorkers.controllers;

import com.mss.BackendWorkers.models.Foto;
import com.mss.BackendWorkers.repository.FotoRepository;
import com.mss.BackendWorkers.service.FotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fotos")
public class FotoController {

    @Autowired
    private FotoService service;

    @GetMapping
    public List<Foto> listarTodas() {
        return service.listarTodas();
    }

    @PostMapping
    public Foto guardar(@RequestBody Foto foto) {
        return service.guardar(foto);
    }

    @GetMapping("/{id}")
    public Foto obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @GetMapping("/por-trabajador/{dni}")
    public List<Foto> obtenerFotosPorTrabajador(@PathVariable String dni) {
        return service.listarFotosPorTrabajador(dni);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
