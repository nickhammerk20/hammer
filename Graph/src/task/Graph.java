package task;


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

