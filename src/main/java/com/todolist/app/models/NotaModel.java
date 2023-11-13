package com.todolist.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "nota")
public class NotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo", nullable = false, length = 80)
    private String titulo;

    @Column(name = "descripcion", nullable = false, columnDefinition = "varchar")
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
