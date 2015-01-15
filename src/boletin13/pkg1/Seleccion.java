package boletin13.pkg1;

/**
 * Descrpcion: Proporciona los datos de la seleccion
 * @author rfernandezgonzalez
 */
public class Seleccion {

    int id;
    String nome;
    String apelido;
    int edade;

    /**
     * Descripcion: Recoge los datos de la seleccion
     * @param id Numero unico entero
     * @param nome Nombre jugador
     * @param apelido Apellido jugador
     * @param edade Numero entero
     */
    public Seleccion(int id, String nome, String apelido, int edade) {

        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    /**
     * Descripcion: Metodo que devuelve la id de la seleccion
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Descripcion: Metodo que da la id de la seleccion
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Descripcion: Metodo que devuelve el nombre de la seleccion
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Descripcion: Metodo que da el nombre de la seleccion
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Descripcion: Metodo que devuelve el apodo de la seleccion
     * @return apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Descripcion: Metodo que da el apodo de la seleccion
     * @param apelido
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * Descripcion: Metodo que devuelve la edad de la seleccion
     * @return edade
     */
    public int getEdade() {
        return edade;
    }

    /**
     * Descripcion: Metodo que da la edad de la seleccion
     * @param edade
     */
    public void setEdade(int edade) {
        this.edade = edade;
    }

    /**
     *
     */
    public void concentrarse() {
        System.out.println("Concéntrase a Selección");
    }

    /**
     *
     */
    public void viaxar() {
        System.out.println("Viaxa a Selección");
    }

    /**
     *
     * @return todos los datos de la seleccion 
    */
    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }

}
