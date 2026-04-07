package Encapsulación;

public class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) this.promedio = promedio;
    }

    public boolean esBecado() {
        return this.promedio >= 85;
    }

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
