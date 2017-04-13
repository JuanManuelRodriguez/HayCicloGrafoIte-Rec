package grafo;

import java.util.ArrayList;
import java.util.List;

public class DfsCicloRec {
	private GrafoDirigido g;
	private Vertice[] vertices;
	int tiempo;
	public DfsCicloRec(GrafoDirigido g){
		this.g=g;
		vertices=new Vertice[g.cantVertices];
		for (int i = 0; i < vertices.length; i++) {
			vertices[i]=new Vertice(i);
		}
		tiempo=0;
	}
	public boolean hayCiclo(){
		for(int i=0;i< vertices.length;i++){
			if(vertices[i].getColor()=="blanco"){
				 return dfsVisit(i,vertices[i]);
			}
		}
		return false;
	}
	private boolean dfsVisit(int i,Vertice v) {
		this.vertices[i].setColor("amarillo");
		this.tiempo++;
		this.vertices[i].setDescubierto(this.tiempo);
		
		Vertice ady=new Vertice();
		if(g.adyacenteDe(v.getNumVertice())!=null){
			ady=g.adyacenteDe(i);
			
			while(ady!=null){
				if(vertices[ady.getNumVertice()].getColor()=="blanco"){
					return dfsVisit(ady.getNumVertice(),ady);
				}
				if(vertices[ady.getNumVertice()].getColor()=="amarillo"){
					return true;//hay ciclo
				}
				ady=ady.getSig();		
			}
		}
		
		this.vertices[i].setColor("negro");
		this.tiempo++;
		this.vertices[i].setFinalizado(this.tiempo);
		return false;
	}
	
}
