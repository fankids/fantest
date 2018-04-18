package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: InitServlet
 * @Description: TODO
 * @author: clli
 * @date: 2018-4-17下午3:18:30
 * @version:  1.0
 * @since: JDK 1.6
 *
 */

public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("************项目初始化 开始 " + this.getClass().getName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName() + "************");
		@SuppressWarnings("unchecked")
		Enumeration<String> em = getInitParameterNames();
		System.out.println("初始化参数如下：");
		while(em.hasMoreElements()) {
			String name = em.nextElement();
			System.out.println("参数名："+ name + "\t参数值：" + getInitParameter(name));	
		}
		System.out.println("************项目初始化 结束 ************");
	}
	
    public InitServlet() {
    	System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("当前类为" + this.getClass().getName() +  "\t当前方法为" + Thread.currentThread().getStackTrace()[1].getMethodName());
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
