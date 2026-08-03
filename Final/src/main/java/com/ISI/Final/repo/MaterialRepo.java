package com.ISI.Final.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ISI.Final.model.Materiales;
import org.springframework.stereotype.Repository;

@Repository
public class MaterialRepo {
    private Map<String, Materiales> materiales = new HashMap<>();
    
    public void guardar(Materiales material){
        materiales.put(material.getCodigo(), material);
    }

    public Materiales buscarCodigo(String codigo){
        return materiales.get(codigo);
    }

    public List<Materiales> buscarDisponibles(){

        List<Materiales> disponibles = new ArrayList<>();

        for(Materiales material : materiales.values()){
            if(material.isDisponible()){
                disponibles.add(material);
            }
        }

        return disponibles;
    }

    public List<Materiales> todos(){
        return new ArrayList<>(materiales.values());
    }

    public void actualizar(Materiales material){
        materiales.put(material.getCodigo(), material);
    }

}
