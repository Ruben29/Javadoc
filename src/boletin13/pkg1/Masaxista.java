package boletin13.pkg1;

/**
 * Descripcion: Proporciona los datos del masajista
 * @author rfernandezgonzalez
 */
public class Masaxista extends Seleccion {

    String titulacion;
    int anosExperiencia;

    /**
     * Descripcion: Recoge los datos del masajista
     * @param id Numero unico entero
     * @param nome Nombre jugador
     * @param apelido Apellido jugador
     * @param edade Numero entero
     * @param titulacion Titulacion del masajista
     * @param anosExperiencia Numero entero
     */
    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {

        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    /**
     * Descripcion: Metodo que devuelve la titulacion del masajista
     * @return tiulacion 
    */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * Descripcion: Metodo que da la tiulacion del masajista 
    * @param titulacion
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * Descripcion: Metodo que devuelve los años de experiencia
     * @return años de experiencia
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /**
     * Descripcion: Metodo que da los años de experiencia
     * @param anosExperiencia
     */
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    /**
     *
     */
    public void darMasaxes() {
    }

    /**
     *
     */
    @Override
    public void viaxar() {
        System.out.println("Viaxa o Masaxista");
    }

    /**
     *
     * @return todos los datos del masajista 
    */
    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

}
