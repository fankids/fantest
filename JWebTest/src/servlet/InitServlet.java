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
 * @date: 2018-4-17����3:18:30
 * @version:  1.0
 * @since: JDK 1.6
 *
 */

public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("************��Ŀ��ʼ�� ��ʼ " + this.getClass().getName() + ":" + Thread.currentThread().getStackTrace()[1].getMethodName() + "************");
		@SuppressWarnings("unchecked")
		Enumeration<String> em = getInitParameterNames();
		System.out.println("��ʼ���������£�");
		while(em.hasMoreElements()) {
			String name = em.nextElement();
			System.out.println("��������"+ name + "\t����ֵ��" + getInitParameter(name));	
		}
		System.out.println("************��Ŀ��ʼ�� ���� ************");
	}
	
    public InitServlet() {
    	System.out.println("��ǰ��Ϊ" + this.getClass().getName() +  "\t��ǰ����Ϊ" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��ǰ��Ϊ" + this.getClass().getName() +  "\t��ǰ����Ϊ" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��ǰ��Ϊ" + this.getClass().getName() +  "\t��ǰ����Ϊ" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("��ǰ��Ϊ" + this.getClass().getName() +  "\t��ǰ����Ϊ" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
