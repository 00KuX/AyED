package contenedores;

import recursos.*;

public class clsTopePila extends clsPilaSLinkedList{
	
	public clsTopePila(){
		super(); 
	}
	
	public Object sacarTope(){
			Object elemento = sacar();
			meter(elemento);
			return elemento;
	}
}
