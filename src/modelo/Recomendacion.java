package modelo;

import java.sql.Timestamp;

public class Recomendacion {

    private int idRecomendacion;
    private int idPrediccion;
    private String tipo;
    private String descripcion;
    private boolean esLeida;
    private boolean alertaCritica;
    private Timestamp fechaGeneracion;

    public Recomendacion() {
    }

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public int getIdPrediccion() {
        return idPrediccion;
    }

    public void setIdPrediccion(int idPrediccion) {
        this.idPrediccion = idPrediccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsLeida() {
        return esLeida;
    }

    public void setEsLeida(boolean esLeida) {
        this.esLeida = esLeida;
    }

    public boolean isAlertaCritica() {
        return alertaCritica;
    }

    public void setAlertaCritica(boolean alertaCritica) {
        this.alertaCritica = alertaCritica;
    }

    public Timestamp getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Timestamp fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
}
