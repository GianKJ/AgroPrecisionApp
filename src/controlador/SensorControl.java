package controlador;

import dao.SensorDAO;
import modelo.Sensor;

import java.sql.Date;
import java.util.List;

public class SensorControl {

    private final SensorDAO dao;

    public SensorControl() {
        this.dao = new SensorDAO();
    }

    public boolean guardar(int idCultivo, String tipoSensor, String modelo,
                           String fechaInstalacionTexto, String estado) {

        Sensor s = new Sensor();
        s.setIdCultivo(idCultivo);
        s.setTipoSensor(tipoSensor);
        s.setModelo(modelo);

        if (fechaInstalacionTexto != null && !fechaInstalacionTexto.trim().isEmpty()) {
            s.setFechaInstalacion(Date.valueOf(fechaInstalacionTexto.trim())); // yyyy-MM-dd
        } else {
            s.setFechaInstalacion(null);
        }

        s.setEstado(estado);

        return dao.insertar(s);
    }

    public boolean actualizar(int idSensor, int idCultivo, String tipoSensor, String modelo,
                              String fechaInstalacionTexto, String estado) {

        Sensor s = new Sensor();
        s.setIdSensor(idSensor);
        s.setIdCultivo(idCultivo);
        s.setTipoSensor(tipoSensor);
        s.setModelo(modelo);

        if (fechaInstalacionTexto != null && !fechaInstalacionTexto.trim().isEmpty()) {
            s.setFechaInstalacion(Date.valueOf(fechaInstalacionTexto.trim()));
        } else {
            s.setFechaInstalacion(null);
        }

        s.setEstado(estado);

        return dao.actualizar(s);
    }

    public boolean eliminar(int idSensor) {
        return dao.eliminar(idSensor);
    }

    public List<Sensor> listarPorCultivo(int idCultivo) {
        return dao.listarPorCultivo(idCultivo);
    }
}

