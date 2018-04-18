package servlet;

import java.io.IOException;
import java.util.Enumeration;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
		response.setCharacterEncoding("GBK");
		response.getWriter().write("返回结果哈哈哈");
		response.getWriter().flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
