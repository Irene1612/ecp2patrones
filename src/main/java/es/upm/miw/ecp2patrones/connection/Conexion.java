package es.upm.miw.ecp2patrones.connection;

public class Conexion {
    private EstadoConexion estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setEstado(new Cerrado());
    }

    public Link getLink() {
        return link;
    }

    protected void setEstado(EstadoConexion estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado.getEstado();
    }

    public void abrir() {
        this.estado.abrir(this);
    }

    public void cerrar() {
        this.estado.cerrar(this);
    }

    public void parar() {
        this.estado.parar(this);
    }

    public void iniciar() {
        this.estado.iniciar(this);
    }

    public void enviar(String msg) {
        this.estado.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        this.estado.recibir(this, respuesta);
    }

}
