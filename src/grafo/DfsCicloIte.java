package grafo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsCicloIte {
	
	private GrafoDirigido g;
	private Vertice[] vertices;
	int tiempo;
	public DfsCicloIte(GrafoDirigido g){
		this.g=g;
		vertices=new Vertice[g.cantVertices];
		for(int i=0;i<vertices.length;i++){
			vertices[i]=new Vertice(i);
		}
		tiempo=0;
	}
	public boolean hayCiclo(){
		Stack<Vertice> pila=new Stack<Vertice>();
		pila.push(this.vertices[0]);
		while(!pila.isEmpty()){
			Vertice v=pila.lastElement();
			if(v.getColor()=="blanco"){
				//this.vertices[v.getNumVertice()].setColor("amarillo");
				pila.lastElement().setColor("amarillo");
				Vertice ady=new Vertice();
				if(g.adyacenteDe(v.getNumVertice())!=null){
					ady=g.adyacenteDe(v.getNumVertice());
					while(ady!=null){
						if(vertices[ady.getNumVertice()].getColor()=="blanco"){
							pila.push(ady);
						}
						if(vertices[ady.getNumVertice()].getColor()=="amarillo"){
							return true;//hay ciclo
						}
						ady=ady.getSig();
								
					}
				};
			}else if (v.getColor()=="amarillo"){	// no hay ciclo
				pila.lastElement().setColor("negro");
				pila.pop();
			}else{
				pila.pop();
			}
				
		}
		return false;
	}

}
