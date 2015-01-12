
package boletin13.pkg1;

public class Boletin151 {

    public static void main(String[] args) {
        
        Xogador xogador1 = new Xogador(12, "Mica", "Salgado", 26, 5, "Delantero Pichichi");
        Adestrador adestrador1 = new Adestrador(11, "Dani", "Souto", 19, "Soy un crack");
        Masaxista masaxista1 = new Masaxista(9, "Marcos", "Cividanes", 19, "Masaxista Sensual", 12);
        Seleccion seleccion1 = new Seleccion(8, "La Roja", "Española", 25);
        Seleccion xogador2 = new Xogador(12, "Mica", "Pereira", 26, 5, "Defensa Pichichi");
        
        xogador1.concentrarse();
        adestrador1.concentrarse();
        masaxista1.concentrarse();
        
        xogador1.viaxar();
        adestrador1.viaxar();
        masaxista1.viaxar();
        
        xogador1.concentrarse();
        
        seleccion1.viaxar();
        
    }
    
}
