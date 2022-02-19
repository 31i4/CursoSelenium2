package com.ejerciciosbasicosjava;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean barking = true;
		int hourOfDay = 10;
		
		shouldWakeUp(ladra ,hora);
		
	}
	
	public static String shouldWakeUp (boolean ladra, int hora) {

		String resultado;
				if (ladra = true) {
					if (hora >= 0 && hora <= 23){
						if ( hora >= 8 && hora <= 22) {
							resultado = System.out.println("Despierta el perro esta ladrando");	
						}else {
							resultado = System.out.println("El perro ladra pero estas durmiendo");
							}
			
					}
					
				}
				
				if (ladra = false) {
					if (hora >= 0 && hora <= 23){
						if ( hora >= 8 && hora <= 22) {
							System.out.println("Duerme");	
						}else {
							System.out.println("El perro no esta ladrando");
							}		
				}
		
		
	
	}

}
}
