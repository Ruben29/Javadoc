package boletin13.pkg1;

/**
 * Descripcion: Proporciona los datos del Entrenador
 * @author rfernandezgonzalez
 */
public class Adestrador extends Seleccion {

    String idFederacion;

    /**
     * Descripcion: Recoge los datos del Entrenador
     * @param id Numero unico entero
     * @param nome Nombre jugador
     * @param apelido Apellido jugador
     * @param edade Numero entero
     * @param idFederacion Numero entero unico
     */
    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {

        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;

    }

    /**
     * Descripcion: Metodo que devuelve el id de la federacion del entrenador
     * @return idFederacion
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * Descripcion: Metodo que da el id de la federacion del entrenador
     * @param idFederacion
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    /**
     *
     */
    public void dirixirPartido() {
    }

    /**
     *
     */
    public void dirixirAdestramento() {
    }

    /**
     *
     */
    @Override
    public void viaxar() {
        System.out.println("Viaxa o Adestrador");
    }

    /**
     *
     * @return Todos los datos del entrenador
     */
    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }

}
