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
	 }

}
