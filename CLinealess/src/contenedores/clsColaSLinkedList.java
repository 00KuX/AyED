package contenedores;
import recursos.*;


public class clsColaSLinkedList implements OperacionesCL1{
	private clsNode frenteC, finalC;
	
	public clsColaSLinkedList(){
		limpiar();
	}

	public boolean estaVacia(){
		return (this.frenteC==null);} 

	//Ojo: este metodo fue modificado para que no funcione. corregir! ;)
	public void meter(Object elemento){
		if (!estaVacia()){
			this.finalC.setNextNode(new clsNode(elemento));
			this.finalC=this.finalC.getNextNode();
			// nuevo nodo es el ultimo.
		}else{
			this.frenteC=null;
		}
	}
	
	public Object sacar(){
		Object elemento = null;
		if (!estaVacia()){
			elemento=this.frenteC.getNodeInfo();
			this.frenteC=this.frenteC.getNextNode();
			if (estaVacia()){
				this.finalC=null; 
			}
		}else{
			System.out.println("Error sacar. Cola vacia");
		}
		return elemento;
	}
	
	public void limpiar(){
		this.frenteC=this.finalC=null;
	}	
	
}
