import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xzMain 
{
	
	public static void main(String[] args) 
	{
		HttpServletRequest req = "data:{idd:$('#idd'),command:(read)}";
		HttpServletResponse resp = null;
		
		xzServlet xz = new xzServlet();
		xz.xzDo(req, resp);
		
	}
}
