package grafo;

import java.util.ArrayList;
import java.util.List;

public class GrafoDirigido extends Grafo{
	int cantVertices;
	ListaVertices[] vertices;
	public GrafoDirigido(int cantVertices){
		this.cantVertices=cantVertices;
		vertices=new ListaVertices[cantVertices];
		for(int i=0;i<cantVertices;i++){
			vertices[i]=new ListaVertices();		
		}
	}
	
	
	@Override
	public int numVertices() {
		return this.cantVertices;
	}

	@Override
	public int numAristas() {
		int count=0;
		for(int i=0;i<vertices.length;i++){
			count+=vertices[i].size();	
		}
		return count;
	}

	@Override
	public boolean existeArita(int i, int j) {
		Vertice aux=new Vertice();
		while(aux!=null && aux.getNumVertice()!=j){
			aux=aux.getSig();
		}
		if(aux!=null && aux.getNumVertice() == j){
			return true;
		}
		return false;
	}

	@Override
	public double pesoArista(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertarArista(int i, int j) {
		vertices[i].add("blanco",j);
	}

	@Override
	public void insertarArista(int i, int j, double peso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vertice adyacenteDe(int i) {
		if(!vertices[i].isEmpty()){
			Vertice aretornar=vertices[i].getFirstVertice();
			return aretornar;
		}else{return null;}
	}
	public ListaVertices[] getVertices(){
		ListaVertices[] vert=new ListaVertices[this.cantVertices];
		vert=this.vertices;
		return vert;
	}

}
