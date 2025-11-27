package controlador;

import dao.RecomendacionDAO;
import modelo.Recomendacion;

import java.sql.Timestamp;
import java.util.List;

public class RecomendacionControl {

    private final RecomendacionDAO dao;

    public RecomendacionControl() {
        this.dao = new RecomendacionDAO();
    }

    public boolean guardar(int idPrediccion,
                           String tipo,
                           String descripcion,
                           boolean esLeida,
                           boolean alertaCritica) {

        Recomendacion r = new Recomendacion();
        r.setIdPrediccion(idPrediccion);
        r.setTipo(tipo);
        r.setDescripcion(descripcion);
        r.setEsLeida(esLeida);
        r.setAlertaCritica(alertaCritica);
        r.setFechaGeneracion(new Timestamp(System.currentTimeMillis()));

        return dao.insertar(r);
    }

    public boolean actualizar(int idRecomendacion,
                              int idPrediccion,
                              String tipo,
                              String descripcion,
                              boolean esLeida,
                              boolean alertaCritica) {

        Recomendacion r = new Recomendacion();
        r.setIdRecomendacion(idRecomendacion);
        r.setIdPrediccion(idPrediccion);
        r.setTipo(tipo);
        r.setDescripcion(descripcion);
        r.setEsLeida(esLeida);
        r.setAlertaCritica(alertaCritica);

        return dao.actualizar(r);
    }

    public boolean eliminar(int idRecomendacion) {
        return dao.eliminar(idRecomendacion);
    }

    public List<Recomendacion> listarPorPrediccion(int idPrediccion) {
        return dao.listarPorPrediccion(idPrediccion);
    }

    public List<Recomendacion> listarTodas() {
        return dao.listarTodas();
    }
}
