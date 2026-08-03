package com.ISI.Final.controller;
//import org.springframework.stereotype.Controller;
import com.ISI.Final.dto.MaterialResponseDTO;
import com.ISI.Final.model.Materiales;
import com.ISI.Final.service.MaterialService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/materiales")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("/disponibles")
    public List<MaterialResponseDTO> disponibles(){

        List<Materiales> materiales = materialService.disponibles();

        List<MaterialResponseDTO> respuesta = new ArrayList<>();

        for(Materiales material : materiales){

            respuesta.add(new MaterialResponseDTO(
                    material.getCodigo(),
                    material.getTitulo(),
                    material.isDisponible()
            ));

        }

        return respuesta;
    }

}