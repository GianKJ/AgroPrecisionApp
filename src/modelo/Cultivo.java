package modelo;

import java.sql.Date;

public class Cultivo {

    private int idCultivo;
    private int idAgricultor;
    private String nombreParcela;
    private String tipoCultivo;
    private double areaHa;
    private Date fechaInicio;
    private String estado;

    public Cultivo() {
    }

    public Cultivo(int idCultivo, int idAgricultor, String nombreParcela, String tipoCultivo,
                   double areaHa, Date fechaInicio, String estado) {
        this.idCultivo = idCultivo;
        this.idAgricultor = idAgricultor;
        this.nombreParcela = nombreParcela;
        this.tipoCultivo = tipoCultivo;
        this.areaHa = areaHa;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public String getNombreParcela() {
        return nombreParcela;
    }

    public void setNombreParcela(String nombreParcela) {
        this.nombreParcela = nombreParcela;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public double getAreaHa() {
        return areaHa;
    }

    public void setAreaHa(double areaHa) {
        this.areaHa = areaHa;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
