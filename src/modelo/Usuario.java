package modelo;

public class Usuario {
    private int idUsuario;
    private int idAgricultor;
    private String nombreUsuario;
    private String passwordHash;
    private java.sql.Timestamp ultimoLogin;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idAgricultor, String nombreUsuario, String passwordHash) {
        this.idUsuario = idUsuario;
        this.idAgricultor = idAgricultor;
        this.nombreUsuario = nombreUsuario;
        this.passwordHash = passwordHash;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
