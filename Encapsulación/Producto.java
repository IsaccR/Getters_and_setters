package Encapsulación;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0.");
        }
    }

   
    public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

  
    public void vender(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println("Venta realizada.");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
}


