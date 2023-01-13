package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HelloDTO dto = new HelloDTO();
		
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		
		request.setAttribute("model", dto);
		
		//view 설정
		return "hello.jsp";
	}
	
}
