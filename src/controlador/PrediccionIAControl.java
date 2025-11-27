package controlador;

import dao.PrediccionIADAO;
import modelo.PrediccionIA;

import java.sql.Timestamp;
import java.util.List;

public class PrediccionIAControl {

    private final PrediccionIADAO dao;

    public PrediccionIAControl() {
        this.dao = new PrediccionIADAO();
    }

    public boolean guardar(int idCultivo,
                           String tipoPrediccion,
                           int probabilidad,
                           String condiciones) {

        PrediccionIA p = new PrediccionIA();
        p.setIdCultivo(idCultivo);
        p.setTipoPrediccion(tipoPrediccion);
        p.setProbabilidad(probabilidad);
        p.setCondicionesFavorables(condiciones);
        p.setFechaPrediccion(new Timestamp(System.currentTimeMillis()));

        return dao.insertar(p);
    }

    public boolean actualizar(int idPrediccion,
                              int idCultivo,
                              String tipoPrediccion,
                              int probabilidad,
                              String condiciones) {

        PrediccionIA p = new PrediccionIA();
        p.setIdPrediccion(idPrediccion);
        p.setIdCultivo(idCultivo);
        p.setTipoPrediccion(tipoPrediccion);
        p.setProbabilidad(probabilidad);
        p.setCondicionesFavorables(condiciones);
        // fecha_prediccion no se cambia aquí, se mantiene la original

        return dao.actualizar(p);
    }

    public boolean eliminar(int idPrediccion) {
        return dao.eliminar(idPrediccion);
    }

    public List<PrediccionIA> listarPorCultivo(int idCultivo) {
        return dao.listarPorCultivo(idCultivo);
    }

    public List<PrediccionIA> listarTodos() {
        return dao.listarTodos();
    }

}
