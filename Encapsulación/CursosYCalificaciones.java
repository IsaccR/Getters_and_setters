package Encapsulación;

public class CursosYCalificaciones {
    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

  
    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota1 = nota;
        } else {
            System.out.println("Error: La nota 1 debe estar entre 0 y 100.");
        }
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota2 = nota;
        } else {
            System.out.println("Error: La nota 2 debe estar entre 0 y 100.");
        }
    }

    public void setNota3(double nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota3 = nota;
        } else {
            System.out.println("Error: La nota 3 debe estar entre 0 y 100.");
        }
    }

    
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

   
    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }
}
