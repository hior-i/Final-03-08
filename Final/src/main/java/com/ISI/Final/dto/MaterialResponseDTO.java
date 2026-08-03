package com.ISI.Final.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MaterialResponseDTO {

    private String codigo;
    private String titulo;
    private boolean disponible;

}