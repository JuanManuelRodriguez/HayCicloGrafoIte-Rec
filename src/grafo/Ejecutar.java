package grafo;

import java.util.List;

public class Ejecutar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GrafoDirigido g=new GrafoDirigido(6);
		g.insertarArista(0, 2);
		g.insertarArista(0, 3);
		ListaVertices toprint=g.adyacenteDe(0);
		Vertice aux=toprint.getFirstVertice();
		while(aux!=null){
			System.out.println("adyacente de 0: "+aux.getNumVertice());
			aux=aux.getSig();
					
		}
	}

}
