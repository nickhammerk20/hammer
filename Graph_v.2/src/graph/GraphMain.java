package graph;


public class GraphMain 
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
		
		String str = gr.toString();
		System.out.println(str);
				
		System.out.println("**********Clone*******");
		Graph grC = (Graph) gr.clone();
		String strC = grC.toString();
		System.out.println(strC);
		System.out.println("**********Clone*******");
		
//		System.out.println("**********del edge********");
//		gr.delEdge("Dnipro", "KR");
//		System.out.println("**********del edge********");
//		str = gr.toString();
//		System.out.println(str);
		
		System.out.println("**********del vertex********");
		gr.delVertex("Kyiv");
		str = gr.toString();
		System.out.println(str);
		System.out.println("**********del vertex********");
		
		System.out.println("**********Clone*******");
		strC = grC.toString();
		System.out.println(strC);
		System.out.println("**********Clone*******");
	}
	
	

}
