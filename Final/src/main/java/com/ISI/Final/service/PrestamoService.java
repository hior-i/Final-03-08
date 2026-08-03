package com.ISI.Final.service;

import org.springframework.stereotype.Service;


import com.ISI.Final.model.Materiales;
import com.ISI.Final.model.Socios;
import com.ISI.Final.strategy.MultaStrategy;

@Service
public class PrestamoService {

    private final MaterialService materialService;
    private final SocioService socioService;

    public PrestamoService(MaterialService materialService, SocioService socioService) {

        this.materialService = materialService;
        this.socioService = socioService;
    }

    public String prestar(String codigoMaterial, Integer idSocio){

        Materiales material = materialService.buscar(codigoMaterial);

        if(material == null){
            return "Material inexistente";
        }

        Socios socio = socioService.buscar(idSocio);

        if(socio == null){
            return "Socio inexistente";
        }

        if(!material.isDisponible()){
            return "Material no disponible";
        }

        material.setDisponible(false);

        materialService.actualizar(material);

        return "Préstamo realizado correctamente";
    }

    public double devolver(String codigoMaterial,
                            Integer idSocio,
                            int dias,
                            MultaStrategy strategy){

        Materiales material = materialService.buscar(codigoMaterial);

        Socios socio = socioService.buscar(idSocio);

        material.setDisponible(true);

        materialService.actualizar(material);

        double multa = strategy.calcular(dias);

        return socio.aplicarDescuento(multa);
    }

}