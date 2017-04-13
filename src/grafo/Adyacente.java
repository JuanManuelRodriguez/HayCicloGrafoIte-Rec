package grafo;

public class Adyacente {
	private int destino;
	private double peso;
	public Adyacente(int codAdyacente, double p){destino=codAdyacente;peso=p;};
	public int getDestino(){
		return destino;
	}
}
