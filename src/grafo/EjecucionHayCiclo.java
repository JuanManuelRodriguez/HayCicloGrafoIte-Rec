package grafo;

public class EjecucionHayCiclo {
	public EjecucionHayCiclo(){
		
	}
	public GrafoDirigido generarGrafo(int cantV){
		GrafoDirigido g=new GrafoDirigido(cantV);
		generarAristas(g,cantV);
		return g;
	}
	private void generarAristas(GrafoDirigido g,int cantV){
		for(int i=0;i<cantV-2;i++){//crea las aristas entre el i-esimo y los i-esimo+1 e i-esimo+2 vertice--por eso se cicla hasta n-2 vertices y el ultimo se genera a mano
			g.insertarArista(i, i+2);
			g.insertarArista(i, i+1);
		}
		g.insertarArista(cantV-2, cantV-1);//vincula con una arista a el anteultimo vertice con el ultimo
	}
	
	
	public static void main(String[] args) {
		EjecucionHayCiclo ejec=new EjecucionHayCiclo();
		GrafoDirigido g=ejec.generarGrafo(20000);//cantidad de vertices ---6
		g.insertarArista(19000, 0);//ciclo
		
		//compruebo si hay ciclo en el grafo con el dfs recursivo
		DfsCicloRec dfs=new DfsCicloRec(g);
		if (dfs.hayCiclo()){
			System.out.println("Hay ciclo en el grafo");
		}
		else{
			System.out.println("No hay ciclos en el grafo");
		}
		
		//compruebo si hay ciclo en el grafo con el dfs recursivo
		DfsCicloIte dfsIt=new DfsCicloIte(g);
		if (dfsIt.hayCiclo()){
			System.out.println("Hay ciclo en el grafo");
		}
		else{
			System.out.println("No hay ciclos en el grafo");
		}
	}

}
