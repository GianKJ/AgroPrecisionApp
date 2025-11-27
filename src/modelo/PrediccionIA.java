package modelo;

public class PrediccionIA {
    private int idPrediccion;
    private int idCultivo;
    private java.sql.Timestamp fechaPrediccion;
    private String tipoPrediccion;
    private int probabilidad;
    private String condicionesFavorables;

    // getters y setters
    public int getIdPrediccion() { return idPrediccion; }
    public void setIdPrediccion(int idPrediccion) { this.idPrediccion = idPrediccion; }

    public int getIdCultivo() { return idCultivo; }
    public void setIdCultivo(int idCultivo) { this.idCultivo = idCultivo; }

    public java.sql.Timestamp getFechaPrediccion() { return fechaPrediccion; }
    public void setFechaPrediccion(java.sql.Timestamp fechaPrediccion) { this.fechaPrediccion = fechaPrediccion; }

    public String getTipoPrediccion() { return tipoPrediccion; }
    public void setTipoPrediccion(String tipoPrediccion) { this.tipoPrediccion = tipoPrediccion; }

    public int getProbabilidad() { return probabilidad; }
    public void setProbabilidad(int probabilidad) { this.probabilidad = probabilidad; }

    public String getCondicionesFavorables() { return condicionesFavorables; }
    public void setCondicionesFavorables(String condicionesFavorables) { this.condicionesFavorables = condicionesFavorables; }
}
