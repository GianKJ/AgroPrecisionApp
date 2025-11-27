package modelo;

import java.sql.Timestamp;

public class DatoSensor {

    private int idDato;
    private int idSensor;
    private Timestamp fecha;
    private double valor;
    private String unidad;

    public DatoSensor() {
    }

    public DatoSensor(int idDato, int idSensor, Timestamp fecha, double valor, String unidad) {
        this.idDato = idDato;
        this.idSensor = idSensor;
        this.fecha = fecha;
        this.valor = valor;
        this.unidad = unidad;
    }

    public int getIdDato() {
        return idDato;
    }

    public void setIdDato(int idDato) {
        this.idDato = idDato;
    }

    public int getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(int idSensor) {
        this.idSensor = idSensor;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
