package com.ISI.Final.strategy;


//100$ por dia
public class MultaNormal implements MultaStrategy{
    /*public double calcularNormal (double monto, int dias) {
        double total =100 * dias;
        return monto + total;
    } */

    @Override
    public double calcular(int dias){
        return dias * 100;
    }

}

