package controlador;

import dao.CultivoDAO;
import modelo.Cultivo;
import java.sql.Date;
import java.util.List;

public class CultivoControl {

    private final CultivoDAO dao;

    public CultivoControl() {
        this.dao = new CultivoDAO();
    }

    public boolean guardar(int idAgricultor, String nombreParcela, String tipoCultivo,
                           double areaHa, String fechaInicioTexto, String estado) {

        Cultivo c = new Cultivo();
        c.setIdAgricultor(idAgricultor);
        c.setNombreParcela(nombreParcela);
        c.setTipoCultivo(tipoCultivo);
        c.setAreaHa(areaHa);

        if (fechaInicioTexto != null && !fechaInicioTexto.trim().isEmpty()) {
            // formato esperado: yyyy-MM-dd
            c.setFechaInicio(Date.valueOf(fechaInicioTexto.trim()));
        } else {
            c.setFechaInicio(null);
        }

        c.setEstado(estado);

        return dao.insertar(c);
    }

    public boolean actualizar(int idCultivo, int idAgricultor, String nombreParcela,
                              String tipoCultivo, double areaHa, String fechaInicioTexto,
                              String estado) {

        Cultivo c = new Cultivo();
        c.setIdCultivo(idCultivo);
        c.setIdAgricultor(idAgricultor);
        c.setNombreParcela(nombreParcela);
        c.setTipoCultivo(tipoCultivo);
        c.setAreaHa(areaHa);

        if (fechaInicioTexto != null && !fechaInicioTexto.trim().isEmpty()) {
            c.setFechaInicio(Date.valueOf(fechaInicioTexto.trim()));
        } else {
            c.setFechaInicio(null);
        }

        c.setEstado(estado);

        return dao.actualizar(c);
    }

    public boolean eliminar(int idCultivo) {
        return dao.eliminar(idCultivo);
    }

    public List<Cultivo> listarTodos() {
        return dao.listarTodos();
    }

    public List<Cultivo> listarPorAgricultor(int idAgricultor) {
        return dao.listarPorAgricultor(idAgricultor);
    }
}
