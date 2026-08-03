package com.ISI.Final.model;

//multa normal
public class SociosRegular extends Socios{
    @Override
    public double aplicarDescuento(double multa){
        return multa;
    }
}

