package com.ISI.Final.service;

import com.ISI.Final.model.Socios;
import com.ISI.Final.repo.SocioRepo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SocioService {

    private final SocioRepo repo;

    public SocioService(SocioRepo repo) {
        this.repo = repo;
    }

    public void guardar(Socios socio){
        repo.guardar(socio);
    }

    public Socios buscar(Integer id){
        return repo.buscarPorId(id);
    }

    public List<Integer> quitarDuplicados(List<Integer> lista){

        Set<Integer> set = new HashSet<>(lista);

        return new ArrayList<>(set);
    }

}