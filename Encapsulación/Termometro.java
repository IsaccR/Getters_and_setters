package Encapsulación;

public class Termometro {
    private double celsius;

    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        } else {
            System.out.println("Error: Temperatura por debajo del cero absoluto.");
        }
    }

    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}
