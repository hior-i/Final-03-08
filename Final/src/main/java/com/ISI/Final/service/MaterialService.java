package com.ISI.Final.service;


import com.ISI.Final.model.Materiales;
import com.ISI.Final.repo.MaterialRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepo repo;

    public MaterialService(MaterialRepo repo) {
        this.repo = repo;
    }

    public void guardar(Materiales material){
        repo.guardar(material);
    }

    public Materiales buscar(String codigo){
        return repo.buscarCodigo(codigo);
    }

    public List<Materiales> disponibles(){
        return repo.buscarDisponibles();
    }

    public void actualizar(Materiales material){
        repo.actualizar(material);
    }

}