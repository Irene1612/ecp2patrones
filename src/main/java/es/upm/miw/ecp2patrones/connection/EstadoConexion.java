package es.upm.miw.ecp2patrones.connection;

public abstract class EstadoConexion {
    
    public abstract Estado getEstado();

    public abstract void abrir(Conexion conexion);

    public abstract void cerrar(Conexion conexion);

    public abstract void parar(Conexion conexion);

    public abstract void iniciar(Conexion conexion);

    public abstract void enviar(Conexion conexion, String msg);

    public abstract void recibir(Conexion conexion, int respuesta);    

}
