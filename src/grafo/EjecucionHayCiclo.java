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
		GrafoDirigido g=ejec.generarGrafo(10000);//cantidad de vertices ---6
		g.insertarArista(8500, 0);//ciclo
		long time_start, time_end;
		
		//compruebo si hay ciclo en el grafo con el dfs recursivo
		DfsCicloRec dfs=new DfsCicloRec(g);
		time_start = System.currentTimeMillis();
		if (dfs.hayCiclo()){
			System.out.println("Hay ciclo en el grafo");
		}
		else{
			System.out.println("No hay ciclos en el grafo");
		}
		time_end = System.currentTimeMillis();
		System.out.println("the task  has taken "+ ( time_end - time_start ) +" milliseconds");
		
		//compruebo si hay ciclo en el grafo con el dfs recursivo
		DfsCicloIte dfsIt=new DfsCicloIte(g);
		time_start = System.currentTimeMillis();
		if (dfsIt.hayCiclo()){
			System.out.println("Hay ciclo en el grafo");
		}
		else{
			System.out.println("No hay ciclos en el grafo");
		}
		time_end = System.currentTimeMillis();
		System.out.println("the task  has taken "+ ( time_end - time_start ) +" milliseconds");
	}
	
	//conclusion: el dfs recursivo es mucho más rápido que el iterativo en aprox. 3 veces, pero cuando hay demasiados vertices y el bucle se forma en uno muy lejano (aprox. 9000)
	//la pila de ejecucion del dfs recursivo se rebalsa. Mientras el dfs iterativo tarda mas, pero no sufre ese rebalse de pila.

}
