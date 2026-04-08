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
	        
	        
	        System.out.println("Intentando vender 30 unidades (más del stock)...");
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
	        
	    
	        
	        System.out.println("\nCurso: " + miCurso.getNombreCurso());
	        System.out.println("Promedio final: " + miCurso.promedio());
	        System.out.println("Estado: " + miCurso.estado());
	
	        
	     // Termómetro 
	        
	        System.out.println("\nTermómetro");
	        Termometro term = new Termometro();
	        term.setCelsius(25.0);
	        System.out.println("Grados Fahrenheit: " + term.getFahrenheit());
	
	     //  estudiante
	        Estudiante est1 = new Estudiante();

	       
	        est1.setNombre("Isaac");
	        est1.setPromedio(88.5); 

	       
	        System.out.println("\nDatos del Estudiante ");
	        System.out.println("Nombre: " + est1.getNombre());
	        
	        System.out.println("Promedio: " + String.format("%.2f", est1.getPromedio()));

	        
	        if (est1.esBecado()) {
	            System.out.println("Resultado: El estudiante TIENE BECA.");
	        } else {
	            System.out.println("Resultado: No aplica para beca.");
	        }
	 
	     // Reloj 
	        System.out.println("\n--- Prueba de Reloj ---");
	        Reloj miReloj = new Reloj();

	        
	        miReloj.setHora(10);
	        miReloj.setMinuto(5);
	        miReloj.setSegundo(30);
	        System.out.println("Hora actual: " + miReloj.mostrarHora()); 

	        
	        System.out.println("Intentando poner 25 horas...");
	        miReloj.setHora(25); 
	        
	        System.out.println("Hora final: " + miReloj.mostrarHora());  
	        
	     // Contacto con Teléfono 
	        
	        System.out.println("\nRegistro de Contacto ");
	        Contacto miContacto = new Contacto();
	        
	        miContacto.setNombre("Isaac");
	        
	        
	        miContacto.setTelefono("12345"); 
	        
	        
	        System.out.println("Intentando poner email sin @...");
	        miContacto.setEmail("correo-falso.com");

	       
	        miContacto.setTelefono("55443322");
	        miContacto.setEmail("isaac@correo.com");

	        System.out.println("Datos finales del contacto:");
	        miContacto.mostrarContacto();
	
	        
	     // Juego con Puntaje Máximo 
	        
	        System.out.println("\nEstado del Jugador");
	        Jugador j1 = new Jugador("Isaac");

	        
	        j1.actualizarPuntaje(50);
	        System.out.println("Puntaje Actual: " + j1.getPuntajeActual() + " | Récord: " + j1.getPuntajeMaximo());

	        
	        j1.actualizarPuntaje(120);
	        System.out.println("Puntaje Actual: " + j1.getPuntajeActual() + " | Récord: " + j1.getPuntajeMaximo());

	        
	        j1.actualizarPuntaje(30);
	        System.out.println("Puntaje Actual: " + j1.getPuntajeActual() + " | Récord: " + j1.getPuntajeMaximo());

	       
	        j1.actualizarPuntaje(-10);
	        
	 
	     //  Factura con Total 
	        System.out.println("\n Generando Factura");
	        Factura miFactura = new Factura();
	        
	        miFactura.setCodigoFactura("FAC-001");
	        miFactura.setDescripcion("Monitor Gamer 24\"");
	        miFactura.setCantidad(2);
	        miFactura.setPrecioUnitario(1250.00);

	        
	        miFactura.mostrarFactura();

	        
	        System.out.println("\nIntentando poner precio negativo...");
	        miFactura.setPrecioUnitario(-50.0);
	 }

}
