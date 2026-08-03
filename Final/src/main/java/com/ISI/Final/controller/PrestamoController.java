package com.ISI.Final.controller;

import com.ISI.Final.dto.DevolucionRequestDTO;
import com.ISI.Final.dto.MultaResponsesDTO;
import com.ISI.Final.dto.PrestamoRequestDTO;
import com.ISI.Final.service.PrestamoService;
import com.ISI.Final.strategy.MultaCampania;
import com.ISI.Final.strategy.MultaFinDeSemana;
import com.ISI.Final.strategy.MultaNormal;
import com.ISI.Final.strategy.MultaStrategy;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @PostMapping("/prestar")
    public String prestar(@RequestBody PrestamoRequestDTO dto){

        return prestamoService.prestar(
                dto.getCodigoMaterial(),
                dto.getIdSocio()
        );
    }

    @PostMapping("/devolver")
    public MultaResponsesDTO devolver(@RequestBody DevolucionRequestDTO dto){

        MultaStrategy strategy;

        String tipo = dto.getTipoMulta() == null ? "" : dto.getTipoMulta().trim().toUpperCase();

        switch (tipo) {

            case "CAMPANIA":
                strategy = new MultaCampania();
                break;

            case "FINDESEMANA":
                strategy = new MultaFinDeSemana();
                break;

            default:
                strategy = new MultaNormal();
        }

        double multa = prestamoService.devolver(
                dto.getCodigoMaterial(),
                dto.getIdSocio(),
                dto.getDiasRetraso(),
                strategy
        );

        return new MultaResponsesDTO(multa);
    }
}