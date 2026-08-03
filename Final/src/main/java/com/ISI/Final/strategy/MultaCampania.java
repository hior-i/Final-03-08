package com.ISI.Final.strategy;

//60$ por dia
public class MultaCampania implements MultaStrategy{

    @Override
    public double calcular(int dias){
        return dias * 60;
    }

}