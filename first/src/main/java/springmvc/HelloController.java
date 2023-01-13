package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


//	1> 필요하지 않는 매개변수 선언
//	2> 리턴타입 고정
//	3> 1개 URL만 처리
//	====> 이렇게 때문에 annotation사용!!
public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HelloDTO dto = new HelloDTO();
		
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		mv.setViewName("hello");
		
		return mv;
	}

//	@Override
//	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
//		HelloDTO dto = new HelloDTO();
//		
//		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
//		
//		request.setAttribute("model", dto);
//		
//		//view 설정
//		return "hello.jsp";
//	}
	
}
