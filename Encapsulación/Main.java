package Encapsulación;

public class Main {
	
	 public static void main(String[] args) {
	        
	        //Persona 
	        System.out.println("Persona 1 ");
	        Persona p = new Persona();
	        p.setNombre("Isaac");
	        p.setEdad(-10); 
	        
	        
	        System.out.println("Nombre: " + p.getNombre() + " | Edad: " + p.getEdad());
	        System.out.println();
	        
	        
	        //Producto 
	     
	        System.out.println("Producto");
	        
	        
	        Producto p1 = new Producto();
	        
	       
	        p1.setCodigo("PROD-001");
	        p1.setNombre("Arroz 1kg");
	        
	       
	        p1.setPrecio(16); 
	        p1.setPrecio(15.50);  
	        
	        
	        p1.setStock(20);
	        
	        
	        System.out.println("Realizando venta de 5 unidades...");
	        p1.vender(5); 
	        
	        
	        System.out.println("Código: " + p1.getCodigo());
	        System.out.println("Producto: " + p1.getNombre());
	        System.out.println("Precio final: Q" + p1.getPrecio());
	        System.out.println("Stock actual: " + p1.getStock());
	        
	        
	        System.out.println("\nIntentando vender 30 unidades (más del stock)...");
	        p1.vender(30);
	 
	    
	        // Cuenta 
	        
	        System.out.println("\nCuenta");
	        
	        
	        Cuenta Cuenta = new Cuenta("Isaac", 500.0, 1234);
	        
	        
	        Cuenta.retirar(100.0, 1234); 
	        
	        
	        Cuenta.retirar(50.0, 0000);
	 
	     // Curso y Calificaciones 
	        
	        
	        CursosYCalificaciones miCurso = new CursosYCalificaciones();
	        miCurso.setNombreCurso("Programación ");
	        
	        miCurso.setNota1(88);
	        miCurso.setNota2(55);
	        miCurso.setNota3(80);
	        
	    
	        
	        System.out.println("Curso: " + miCurso.getNombreCurso());
	        System.out.println("Promedio final: " + miCurso.promedio());
	        System.out.println("Estado: " + miCurso.estado());
	 }

}
