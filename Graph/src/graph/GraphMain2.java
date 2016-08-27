package graph;


public class GraphMain2 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Graph gr = new Graph();
		gr.addVertex("Dnipro");
		gr.addVertex("Kyiv");
		gr.addVertex("Lviv");
		gr.addVertex("Kirovograd");
		gr.addVertex("Odessa");
		gr.addVertex("Kharkiv");
		
		
		gr.addEdge("Dnipro", "Lviv", 1100);
		gr.addEdge("Dnipro", "Kyiv", 590);
		gr.addEdge("Dnipro", "Dnipro", 0);
		gr.addEdge("Dnipro", "KRig", 190);
		gr.addEdge("Lviv", "Dnipro", 1100);
		gr.addEdge("KRig","Dnipro", 190);
		gr.addEdge("Kirovograd","Dnipro", 200);
		gr.addEdge("Odessa","Dnipro", 500);
		gr.addEdge("Kharkiv","Dnipro", 300);
		gr.addEdge("Kyiv", "Dnipro", 590);
		
		String str = gr.toString();
		System.out.println(str);
		
		System.out.println("***************************");
		
		GraphWays way = new GraphWays();
		
		way.findWay(gr, "Dnipro", "Lviv");
		System.out.println( way );

	}
}
