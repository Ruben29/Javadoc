package boletin13.pkg1;

/**
 * Descripcion: Proporciona los datos de los jugadores
 * @author rfernandezgonzalez
 */
public class Xogador extends Seleccion {

    int dorsal;
    String demarcacion;
/**
 * Descripcion: Recoge los datos del jugador
 * @param id Numero unico entero
 * @param nome Nombre jugador
 * @param apelido Apellido jugador
 * @param edade Numero entero
 * @param dorsal Numero entero unico
 * @param demarcacion Posicion
 */
    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {

        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    /**
     * Descripcion: Metodo que devuelve el dorsal del jugador
     * @return dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Descripcion: Metodo que da el dorsal del jugador
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * Descripcion: Metodo que devuelve la demarcacion del jugador
     * @return demarcacion
     */
    public String getDemarcación() {
        return demarcacion;
    }

    /**
     * Descripcion: Metodo que da la demarcacion del jugador
     * @param demarcación
     */
    public void setDemarcación(String demarcación) {
        this.demarcacion = demarcación;
    }

    /**
     *
     */
    public void xogarPartido() {
    }

    /**
     *
     */
    public void entrenar() {
    }

    /**
     *
     */
    @Override
    public void viaxar() {
        System.out.println("Viaxan os Xogadores");
    }

    /**
     *
     * @return Todos los datos del jugador
     */
    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcaci\u00f3n=" + demarcacion + '}';
    }

}
