package task;


public class GraphMain 
{
	public static void main(String[] args)
	{
		Graph gr = new Graph();
		gr.addVertex("Dnipro");
		gr.addVertex("Kyiv");
		gr.addVertex("Lviv");
		
		gr.addEdge("Dnipro", "Lviv", 1100);
		gr.addEdge("Dnipro", "Kyiv", 590);
		gr.addEdge("Dnipro", "Dnipro", 0);
		gr.addEdge("Dnipro", "KR", 190);
		gr.addEdge("Lviv", "Dnipro", 1100);
		
		String str = gr.toString();
		System.out.println(str);
	}

}
