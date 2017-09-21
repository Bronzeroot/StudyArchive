import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calc") //form태그 중요!! form태그 옆에 Action!
@SuppressWarnings("serial")
public class CalculatorServlet extends GenericServlet{
 @Override //Class가 메모리에 올라가면 서비스를 찾아서 올린다. Service는 상속 받았기에 이미 있다.
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
		 out.println("0으로 나눌 수 없습니다.");
		 return;
		 //만약 Service가 비어있다면 doGet()은 있어야 한다. 그래야 작동이 됨. 
	     }
		 result = v1 / v2; break;
	 	
		 //쓰려는 Method에 따라서 다른 것을 상속받아서 사용한다. 
	 }
	 out.println(result);
	
 }
 	
}
[출처] HTML로 접근하는 계산기 Java|작성자 역삼동견과류