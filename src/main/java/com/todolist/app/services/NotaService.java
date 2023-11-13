package com.todolist.app.services;

import com.todolist.app.models.NotaModel;
import com.todolist.app.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NotaService {

    @Autowired
    NotaRepository notaRepository;

    public ArrayList<NotaModel> listarNotas() {
        return (ArrayList<NotaModel>) notaRepository.findAll();
    }

    public NotaModel insertarNota(NotaModel notamodel) {
        return notaRepository.save(notamodel);
    }

    public void borrarNotaPorId(Long id) {
        notaRepository.deleteById(id);
    }

}
