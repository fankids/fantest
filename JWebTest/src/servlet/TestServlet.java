package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: TestServlet
 * @Description: TODO
 * @author: clli
 * @date: 2018-4-17下午3:17:45
 * @version:  1.0
 * @since: JDK 1.6
 *
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
    	System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
    public TestServlet() {
    	System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
		
		String todayNow = new Date().toLocaleString();
		
		request.setCharacterEncoding("UTF-8");
		Map<String, String> reqMap = request.getParameterMap();
		Set<String> reqKeySet = reqMap.keySet();
		
		response.setCharacterEncoding("GBK");
		response.getWriter().write("所有请求参数：<br />");
		
		for(Iterator<String> it = reqKeySet.iterator(); it.hasNext(); ) {
			String key = it.next();
			response.getWriter().write(key + "：" + request.getParameter(key) + "<br />");
		}
		response.getWriter().write("<br />当前时间：" + todayNow);
		response.getWriter().flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
