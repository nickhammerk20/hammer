package servlet6;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestServlet
{

	@Test
	public void testRead()
	{
		SCommand sc = new SCommand();
		RequestMock request = new RequestMock("read");
		ResponseMock response = new ResponseMock();
		sc.doGet(request, response);
	}

	@Test
	public void testCreate()
	{
		SCommand sc = new SCommand();
		RequestMock request = new RequestMock("create");
		ResponseMock response = new ResponseMock();
		sc.doGet(request, response);
		
		request = new RequestMock("read");
		sc.doGet(request, response);
	}
	
	@Test
	public void testUpdate()
	{
		SCommand sc = new SCommand();
		RequestMock request = new RequestMock("update");
		ResponseMock response = new ResponseMock();
		sc.doGet(request, response);
	}
	
	@Test
	public void testDelete()
	{
		SCommand sc = new SCommand();
		RequestMock request = new RequestMock("delete");
		ResponseMock response = new ResponseMock();
		sc.doGet(request, response);
	}
}
