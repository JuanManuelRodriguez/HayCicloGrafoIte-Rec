package grafo;


public class ListaVertices {
	private Vertice v;
	private int cantVertices;
	public ListaVertices(){
		v=null;
		this.cantVertices=0;
	}
	public boolean isEmpty(){
		return (v == null);
	}
	public void add(String color, int numVertice){
		if(!isEmpty()){
			Vertice nuevo=new Vertice("blanco");
			nuevo.setNumVertice(v.getNumVertice());
			nuevo.setSig(v.getSig());
			v.setNumVertice(numVertice);
			v.setSig(nuevo);
		}else{
			v=new Vertice("blanco");
			v.setNumVertice(numVertice);
		}
		this.cantVertices++;
	}
	
	public void deleteValor(int numVertice){
		Vertice cursor=this.v;
		if(cursor!=null){
			if(cursor.getNumVertice()==numVertice){//caso de que haya que borrar el primer nodo
				v=cursor.getSig();
				this.cantVertices--;
			}
			boolean encontre=false;
			while(cursor.getSig()!=null && !encontre){//cuando hay que borra un nodo intermedio o final
				if(cursor.getSig().getNumVertice()==numVertice){
					Vertice aux=cursor.getSig();
					cursor.setSig(aux.getSig());
					aux.setSig(null);
					encontre=true;
					this.cantVertices--;
				}
				else{
					cursor=cursor.getSig();
				}
				
			}
		}
	}
	
	public Integer size(){
		return this.cantVertices;
	}
	
	public Vertice getFirstVertice(){
		if(this.isEmpty()){return null;}
		return v;
	}
}
