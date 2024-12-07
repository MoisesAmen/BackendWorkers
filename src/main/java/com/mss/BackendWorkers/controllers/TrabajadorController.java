package com.mss.BackendWorkers.controllers;

import com.mss.BackendWorkers.models.Trabajador;
import com.mss.BackendWorkers.service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")
public class TrabajadorController {

    @Autowired
    private TrabajadorService service;

    @GetMapping
    public List<Trabajador> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Trabajador guardar(@RequestBody Trabajador trabajador) {
        return service.guardar(trabajador);
    }

    @GetMapping("/{dni}")
    public Trabajador obtenerPorDni(@PathVariable String dni) {
        return service.obtenerPorDni(dni);
    }

    @DeleteMapping("/{dni}")
    public void eliminar(@PathVariable String dni) {
        service.eliminar(dni);
    }
}
