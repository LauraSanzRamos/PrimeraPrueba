import java.util.Scanner;
import java.util.InputMismatchException;

public class ArraySoloNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int contador=1;
		String nombreMayor=" ";
		double notaMayor=0;
		double nota=0;
		double array[]= new double[5];
		
		for(int i=0; i<array.length; i++){
				
			System.out.println("Nombre del alumno nº: " + contador);
				String nombre = scan.nextLine();  
			boolean esCorrecto=false;	
			
		while(!esCorrecto){
			try{
				System.out.println("Introduce la nota:"); 
					nota = scan.nextDouble(); 
					scan.nextLine();
				if(nota<0 || nota>10){
					throw new IllegalArgumentException ("rango de notas incorrecto");
				}
				esCorrecto=true;

			}
			catch(InputMismatchException e){
				System.out.println("error al introducir la nota");
					scan.nextLine();
			}
			catch(IllegalArgumentException e2){
				System.out.println(e2.getMessage());
			}
		}
					
			if(nota>notaMayor){
				notaMayor=nota;
				nombreMayor=nombre;
			}		
			
			array[i]=nota;

					contador++;
		}
		
		System.out.println("La nota más alta es un: " + notaMayor);
		
		for(int i=0; i<array.length; i++){
			if (array[i]==notaMayor){
				System.out.println("está en la posición:" + i);
			}
		}	
	
	}

}