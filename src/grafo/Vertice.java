package grafo;

public class Vertice {
	private String color;
	private int descubierto;
	private int finalizado;
	private int numV;
	private Vertice sig;
	public Vertice(String c){
		color=c;
		descubierto=0;
		finalizado=0;
		this.sig=null;
	}
	public Vertice(){}
	public Vertice(int numV){
		color="blanco";
		this.numV=numV;
	}
	public void setColor(String c){
		this.color=c;
	}
	public String getColor(){
		return this.color;
	}
	public void setDescubierto(int d){
		this.descubierto=d;
	}
	public int getDescubierto(){
		return this.descubierto;
	}
	public void setFinalizado(int f){
		this.finalizado=f;
	}
	public int getFinalizado(){
		return this.finalizado;
	}
	public void setNumVertice(int i){
		this.numV=i;
	}
	public int getNumVertice(){
		return this.numV;
	}
	public void setSig(Vertice v){
		this.sig=v;
	}
	public Vertice getSig(){
		return this.sig;
	}
}
