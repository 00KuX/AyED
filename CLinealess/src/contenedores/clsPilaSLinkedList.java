package contenedores;
import recursos.*;


public class clsPilaSLinkedList implements OperacionesCL1{
	private clsNode pila;
	
	public clsPilaSLinkedList(){
		limpiar(); 
	}
	
	public void meter(Object elemento){
		this.pila=new clsNode(elemento, this.pila);
		// la cabeza es el elemento ingresado!
	} 

	public boolean estaVacia(){
		return (this.pila==null);
	} 
	
	public void limpiar(){
		this.pila=null;
	}
	
	public Object sacar(){
		Object elemento = null;
		if (!estaVacia()){
			elemento=this.pila.getNodeInfo();
			this.pila=this.pila.getNextNode();
		}else{
			System.out.println("Error sacar. Pila vacia");}
		return elemento; 
	}
	
	public void muestra(){
		clsNode temp;
		if (!estaVacia()){
			temp=this.pila;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}
		}else{
			System.out.println("Error muestra. Pila vacia");
		}
	}
	
}