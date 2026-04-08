package Encapsulación;

public class Jugador {

	private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }

    
    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje >= 0) {
            this.puntajeActual = nuevoPuntaje;
            
            
            if (this.puntajeActual > this.puntajeMaximo) {
                this.puntajeMaximo = this.puntajeActual;
                System.out.println("¡NUEVO RÉCORD! Felicidades " + nombre);
            }
        } else {
            System.out.println("Error: El puntaje no puede ser negativo.");
        }
    }

    
    public String getNombre() { return nombre; }
    public int getPuntajeActual() { return puntajeActual; }
    public int getPuntajeMaximo() { return puntajeMaximo; }
}
