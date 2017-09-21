import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calc") //form�±� �߿�!! form�±� ���� Action!
@SuppressWarnings("serial")
public class CalculatorServlet extends GenericServlet{
 @Override //Class�� �޸𸮿� �ö󰡸� ���񽺸� ã�Ƽ� �ø���. Service�� ��� �޾ұ⿡ �̹� �ִ�.
 public void service(ServletRequest request, ServletResponse response)
 	throws ServletException, IOException{
	 String operator = request.getParameter("op");
	 int v1 = Integer.parseInt(request.getParameter("v1"));
	 int v2 = Integer.parseInt(request.getParameter("v2"));
	 int result = 0;
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 switch(operator){
	 case"+":result =v1 + v2;break;
	 case"-":result = v1 - v2;break;
	 case"*":result = v1 * v2;break;
	 case"/": if( v2==0){
		 out.println("0���� ���� �� �����ϴ�.");
		 return;
		 //���� Service�� ����ִٸ� doGet()�� �־�� �Ѵ�. �׷��� �۵��� ��. 
	     }
		 result = v1 / v2; break;
	 	
		 //������ Method�� ���� �ٸ� ���� ��ӹ޾Ƽ� ����Ѵ�. 
	 }
	 out.println(result);
	
 }
 	
}
[��ó] HTML�� �����ϴ� ���� Java|�ۼ��� ���ﵿ�߰���