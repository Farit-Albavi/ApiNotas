package com.todolist.app.controllers;

import com.todolist.app.models.NotaModel;
import com.todolist.app.services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/nota")
public class NotaController {

    @Autowired
    NotaService notaService;

    @CrossOrigin
    @GetMapping()
    public ArrayList<NotaModel> listadoNotas() {
        return notaService.listarNotas();
    }

    @CrossOrigin
    @PostMapping()
    public NotaModel insertarNotx(@RequestBody NotaModel notaModel) {
        return this.notaService.insertarNota(notaModel);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public boolean borrarNotaPorId(@PathVariable Long id) {
        try {
            notaService.borrarNotaPorId(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
