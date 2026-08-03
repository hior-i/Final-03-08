package com.ISI.Final.dto;

public class DevolucionRequestDTO {

    private String codigoMaterial;
    private Integer idSocio;
    private int diasRetraso;
    private String tipoMulta;

    public DevolucionRequestDTO() {
    }

    public DevolucionRequestDTO(String codigoMaterial,
                                Integer idSocio,
                                int diasRetraso,
                                String tipoMulta) {
        this.codigoMaterial = codigoMaterial;
        this.idSocio = idSocio;
        this.diasRetraso = diasRetraso;
        this.tipoMulta = tipoMulta;
    }

    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public String getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(String tipoMulta) {
        this.tipoMulta = tipoMulta;
    }
}