package EjercicioLineaH;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObjetoRobot {

	public boolean pedirNuevamente=true; 
	
	public int Leer2 (){
		
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0 || valorConvertido>2 ) {
				System.out.println("	MENSAJE: El numero ingresado no corresponde a ninguna de las opciones propuestas.");
				System.out.println("                                  *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero valido.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	

	public int LeerEstacion (){
		
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0 || valorConvertido>11 ) {
				System.out.println("	MENSAJE: El numero ingresado no corresponde a ninguna de las estaciones");
				System.out.println("                 *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
}
