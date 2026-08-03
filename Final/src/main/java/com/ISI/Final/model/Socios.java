package com.ISI.Final.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public abstract class Socios {
    private int id;
    private String nombre;

    public abstract double aplicarDescuento(double multa);

}
