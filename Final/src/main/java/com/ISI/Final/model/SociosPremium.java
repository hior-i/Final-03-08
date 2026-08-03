package com.ISI.Final.model;

// 50% de descuento
public class SociosPremium extends Socios{

    @Override
    public double aplicarDescuento(double multa){
        return multa * 0.5;
    }

}