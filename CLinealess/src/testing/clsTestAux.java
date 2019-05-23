package testing;
import contenedores.*;


import java.util.Scanner;

public class clsTestAux {
	public static void main(String[] args) {
		Object objAux;
		Scanner sc1, sc2;
		int n, elemento; 
		
		System.out.println("Ingrese cantidad");
		sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		
		if (n>0){
			//clsPilaSLinkedList objPila = new clsPilaSLinkedList();
			clsTopePila objPila = new clsTopePila();
			for (int i=0; i<n; i++){
				System.out.println("Ingrese elemento");
				sc2 = new Scanner(System.in);
				elemento=sc2.nextInt();
				
				objPila.meter(new Integer(elemento));				
			}
			
			if (!objPila.estaVacia()) {
				objPila.sacarTope();
				System.out.println("Elemento Pila " + objPila.sacarTope());
			}
			
			while (!objPila.estaVacia()){
				objAux=objPila.sacar();
				if (objAux!=null){
					System.out.println("Elemento Pila " + objAux.toString());
				}		
			}
			
			objAux=objPila.sacar();
		}
		sc1.close();
	}
	/*	
		
		Object objAux;
		Scanner sc1, sc2;
		int n, elemento; 
		
		System.out.println("Ingrese cantidad");
		sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		
		if (n>0){
			clsColaSLinkedList objCola = new clsColaSLinkedList();
			
			for (int i=0; i<n; i++){
				System.out.println("Ingrese elemento");
				sc2 = new Scanner(System.in);
				elemento=sc2.nextInt();
				
				objCola.meter(new Integer(elemento));				
			}
			
			while (!objCola.estaVacia()){
				objAux=objCola.sacar();
				if (objAux!=null){
					System.out.println("Elemento Cola " + objAux.toString());
				}		
			}
			
			objAux=objCola.sacar();
		} 
	}		*/

		
}
