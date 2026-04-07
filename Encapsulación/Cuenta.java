package Encapsulación;

public class Cuenta{
    
	private String titular;
	private double saldo;
    private int pin;

    
    public Cuenta(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void retirar(double cantidad, int pinIngresado) {
       
        if (this.pin == pinIngresado) {
            
            
            if (cantidad <= this.saldo) {
                this.saldo -= cantidad;
                System.out.println("Retiro exitoso. Saldo restante: " + this.saldo);
            } else {
                System.out.println("Error: Saldo insuficiente.");
            }
            
        } else {
            System.out.println("PIN incorrecto. Acceso denegado.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}
