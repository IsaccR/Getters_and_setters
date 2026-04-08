package Encapsulación;

public class Factura {

	 private String codigoFactura;
	    private String descripcion;
	    private int cantidad;
	    private double precioUnitario;

	    public void setCodigoFactura(String codigo) {
	        this.codigoFactura = codigo;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public void setCantidad(int cantidad) {
	        if (cantidad > 0) {
	            this.cantidad = cantidad;
	        } else {
	            System.out.println("Error: La cantidad debe ser mayor a 0.");
	        }
	    }

	    public void setPrecioUnitario(double precio) {
	        if (precio > 0) {
	            this.precioUnitario = precio;
	        } else {
	            System.out.println("Error: El precio debe ser mayor a 0.");
	        }
	    }

	    
	    public double calcularTotal() {
	        return cantidad * precioUnitario;
	    }

	    
	    public void mostrarFactura() {
	        System.out.println("FACTURA: " + codigoFactura);
	        System.out.println("Descripción: " + descripcion);
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio Unitario: Q" + String.format("%.2f", precioUnitario));
	        System.out.println("TOTAL A PAGAR: Q" + String.format("%.2f", calcularTotal()));
	    }
	}

