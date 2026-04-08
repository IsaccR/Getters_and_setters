package Encapsulación;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: Hora no válida (0-23).");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: Minuto no válido (0-59).");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Error: Segundo no válido (0-59).");
        }
    }

    
    public String mostrarHora() {
        
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
