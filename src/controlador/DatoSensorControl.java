package controlador;

import dao.DatoSensorDAO;
import modelo.DatoSensor;

import java.sql.Timestamp;
import java.util.List;

public class DatoSensorControl {

    private final DatoSensorDAO dao;

    public DatoSensorControl() {
        this.dao = new DatoSensorDAO();
    }

    public boolean guardar(int idSensor, double valor, String unidad) {
        DatoSensor d = new DatoSensor();
        d.setIdSensor(idSensor);
        d.setValor(valor);
        d.setUnidad(unidad);

        // Fecha/hora actual del sistema
        d.setFecha(new Timestamp(System.currentTimeMillis()));

        return dao.insertar(d);
    }

    public List<DatoSensor> listarPorSensor(int idSensor, int limite) {
        return dao.listarPorSensor(idSensor, limite);
    }
}
