package modelo;

import java.sql.Date;

public class Sensor {

    private int idSensor;
    private int idCultivo;
    private String tipoSensor;
    private String modelo;
    private Date fechaInstalacion;
    private String estado;

    public Sensor() {
    }

    public Sensor(int idSensor, int idCultivo, String tipoSensor, String modelo,
                  Date fechaInstalacion, String estado) {
        this.idSensor = idSensor;
        this.idCultivo = idCultivo;
        this.tipoSensor = tipoSensor;
        this.modelo = modelo;
        this.fechaInstalacion = fechaInstalacion;
        this.estado = estado;
    }

    public int getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(int idSensor) {
        this.idSensor = idSensor;
    }

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

