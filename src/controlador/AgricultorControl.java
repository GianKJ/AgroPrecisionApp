package controlador;

import dao.AgricultorDAO;
import modelo.Agricultor;
import java.util.List;

public class AgricultorControl {

    private final AgricultorDAO dao;

    public AgricultorControl() {
        this.dao = new AgricultorDAO();
    }

    public boolean guardar(String nombre, String apellido, String dni,
                           String telefono, String email, String direccion) {

        Agricultor a = new Agricultor();
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setDni(dni);
        a.setTelefono(telefono);
        a.setEmail(email);
        a.setDireccion(direccion);

        return dao.insertar(a);
    }

    public boolean actualizar(int id, String nombre, String apellido, String dni,
                              String telefono, String email, String direccion) {

        Agricultor a = new Agricultor();
        a.setIdAgricultor(id);
        a.setNombre(nombre);
        a.setApellido(apellido);
        a.setDni(dni);
        a.setTelefono(telefono);
        a.setEmail(email);
        a.setDireccion(direccion);

        return dao.actualizar(a);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }

    public List<Agricultor> listar() {
        return dao.listarTodos();
    }

    public Agricultor obtenerPorId(int id) {
        return dao.obtenerPorId(id);
    }
}
