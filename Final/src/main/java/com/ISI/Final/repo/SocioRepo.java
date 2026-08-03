package com.ISI.Final.repo;

import com.ISI.Final.model.Socios;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SocioRepo {

    private final Map<Integer, Socios> socios = new HashMap<>();

    public void guardar(Socios socio){
        socios.put(socio.getId(), socio);
    }

    public Socios buscarPorId(Integer id){
        return socios.get(id);
    }

    public List<Socios> listar(){
        return new ArrayList<>(socios.values());
    }

}