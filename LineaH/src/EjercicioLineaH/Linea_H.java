package EjercicioLineaH;

public class Linea_H {

	public static void main(String[] args) {
		
		//Arreglo de la Linea H
		String[] Estaciones= {"Las Heras","Santa Fe","Córdoba","Corrientes","Once","Venezuela",
				               "Humberto I","Anclán","Caseros","Parque Patricios","Hospitales"};
		int estor=0,estde=0, ing=0;
		ObjetoRobot Obj = new ObjetoRobot();

// Se muestran las Estaciones de la Linea H
		
		do{

			System.out.println("      ESTACIONES DE LA LINEA H    \n");

			for(int i=0;i<Estaciones.length;i++){
				System.out.println((i+1)+"."+ " "+Estaciones[i]);
			}

			// Solicitud de la estacion Origen

			do{	
				while (Obj.pedirNuevamente)
				{	
					System.out.println("\n Por favor indique el numero de la estacion en la que se encuentra:");
					estor=Obj.LeerEstacion();
				}
				Obj.pedirNuevamente = !(Obj.pedirNuevamente);

			}while (estor<=0 || estor>11);
			
			do{
				// Solicitud de la estacion Destino

				do{	
					while (Obj.pedirNuevamente)
					{	
						System.out.println("\n Por favor indique el numero de la estacion a la que se dirige:");
						estde=Obj.LeerEstacion();
					}
					Obj.pedirNuevamente = !(Obj.pedirNuevamente);

				}while (estde<=0 || estde>11);

				if (estor==estde){

					System.out.println("\n Usted ya se encuentra en la estacion "+Estaciones[estor-1]+".");
				}
				
			}while (estor==estde);
			
			// LLegada del Subte a la estacion y se pregunta si desea ingresar a este

			do{	
				while (Obj.pedirNuevamente)
				{	
					System.out.println("El subte acaba de llegar y se abren sus puertas.\n\n  ¿Desea Ingresar?\n 1. Si \n 2. NO \n\n Digite el numero segun su respuesta.");
					ing=Obj.Leer2();
				}
				Obj.pedirNuevamente = !(Obj.pedirNuevamente);

			}while (ing<=0 || ing>2);

		// Segun la respuesta de ingreso se evalua lo siguiente
			//Si no ingreso, un mensaje de despesdida. 
			if (ing==2){
				System.out.println("  ******************* \n  Ha elegido no ingresar. Se cierran las puertas del subte y se pone en marcha.");
				System.out.println("  Feliz día.");
				System.out.println("  ******************* \n");
			}
			
			//Si ingresa al Subte, se indicaran las estaciones por las que pasa hasta su destino.
			else{
				System.out.println("\n *** Bienvenido a bordo y buen viaje ***\n\n Usted inicia en la estacion "+Estaciones[estor-1]+"\n");
				
				if (estor<estde){
					
					for(int i=(estor-1);i<(estde-1);i++){
						if ((i+1)!=(estde-1)){
							System.out.println(" Paso por la estacion "+Estaciones[i+1]);
						}
						
						if ((i+1)==(estde-1)) {
							System.out.println(" LLego a su destino. Esta en la estacion "+Estaciones[i+1]);
						}
					}
					System.out.println("\n Gracias por viajar con Codo a Codo ");
				}else {
					
					for(int i=(estor-1);i>(estde-1);i--){
						if ((i-1)!=(estde-1)){
							System.out.println(" Paso por la estacion "+Estaciones[i-1]);
						}
						
						if ((i-1)==(estde-1)) {
							System.out.println(" LLego a su destino. La estacion "+Estaciones[i-1]);
						}
					}
					System.out.println("\n Gracias por viajar con Codo a Codo ");
				}
			}

		}while (ing==2);

	}

}
