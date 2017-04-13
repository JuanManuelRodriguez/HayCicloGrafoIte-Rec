package grafo;

import java.util.List;

public abstract class Grafo {
	public Grafo(){};
	public abstract int numVertices();
	public abstract int numAristas();
	public abstract boolean existeArita(int i, int j);
	public abstract double pesoArista(int i, int j);
	public abstract void insertarArista(int i, int j);
	public abstract void insertarArista(int i, int j,double peso);
	public abstract Vertice adyacenteDe(int i);
}
