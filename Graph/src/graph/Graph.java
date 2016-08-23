package graph;


public class Graph 
{
	class Vertex
	{
		String val;
		Vertex next;
		Edge root;

		public Vertex(String val)
		{
			this.val = val;
		}
		@Override
		public String toString()
		{
			String str = "city => " + val +"\n";
			Edge eg = root;
			while(eg !=null)
			{
				str += eg.toString();
				eg = eg.next;
			}
			return str;
		}
	}
	class Edge
	{
		int val;
		Edge next;
		Vertex link;
		public Edge(int val)
		{
			this.val = val;
		}
		@Override
		public String toString()
		{
			String str = "\t to city=>"+ link.val+ " "+val+"\n";
			return str;
		}
	}

	Vertex root = null;

	@Override
	public String toString()
	{
		String str = "";
		Vertex vr = root;
		while(vr != null)
		{
			str += vr.toString();
			vr = vr.next;
		}
		return str;
	}

	public void addVertex(String val)
	{
		Vertex vr = new Vertex(val);
		vr.next = root;
		root = vr;
	}
	private Vertex addVertexIn(String val)
	{
		Vertex vr = new Vertex(val);
		vr.next = root;
		root = vr;
		return root;
	}

	public void addEdge(String from, String to, int val)
	{
		Vertex v1 = findVertex(from);
		Vertex v2 = findVertex(to);
		Edge eg = new Edge(val);
		eg.link = v2;
		eg.next = v1.root;
		v1.root = eg;
	}

	public void delVertex(String val)
	{
		Vertex vr = root;
		
		while(vr != null)
		{
			
			if(vr.root.link.equals(val))
			{
//				System.out.println( "нашли вершину в удалении ребра => "+ vr.val);
				break;
			}
			vr = vr.next;
		}
	}

	public void delEdge(String from, String to)
	{
		System.out.println(from+" "+ to);

		Vertex vr = root;
		while(vr != null)
		{
			if(vr.val.equals(from))
			{
//				System.out.println( "нашли вершину в удалении ребра => "+ vr.val);
				break;
			}
			vr = vr.next;
		}
		if(vr.root.link.val.equals(to))
		{
//			System.out.println("случай первого элемента. Удаляем ребро " + from + " => " + to);
			vr.root = vr.root.next;
		}
		else
		{
//			System.out.println("случай второго элемента. Удаляем ребро " + from + " => " + to);
			delEdgeIn( to, vr.root);			
		}
	}	

	private void delEdgeIn(String to, Edge eg)
	{
		while(eg.next != null)
		{
			if(eg.next.link.val.equals(to))
			{
				//				System.out.println( "нашли нашли ребро в удалении ребра => "+ eg.link.val + " eg.link.next.val " + eg.link.next.val);
				eg.next = eg.next.next;
				break;
			}
			eg = eg.next;
		}
	}

	private Vertex findVertex(String val)
	{
		Vertex ret = null;

		Vertex vr = root;
		while(vr != null)
		{
			if(vr.val.equals(val))
			{
				break;
			}
			vr = vr.next;
		}
		if(vr == null)
		{
			addVertex(val);
			ret = root;
		}
		else
		{
			ret = vr;
		}
		return ret;
	}
}

