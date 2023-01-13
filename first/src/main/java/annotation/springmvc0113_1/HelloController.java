package annotation.springmvc0113_1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//	1> 필요하지 않는 매개변수 선언
//	2> 리턴타입 고정
//	3> 1개 URL만 처리
//	====> 이렇게 때문에 annotation사용!!
	
@Controller
public class HelloController{

	@RequestMapping("/hello")
	public ModelAndView a(){
		HelloDTO dto = new HelloDTO();
		
		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", dto);
		mv.setViewName("hello");
		
		return mv;
	}
	
	@RequestMapping("/hello2")
	public String b() { //매핑메소드리턴타입 String --model 없고 - jsp이름
		
		return "hello"; //WEB-INF/views/?.jsp
	}
	
	@RequestMapping("/hello3")
	public void c() { //매핑메소드리턴타입 String --model 없고 - jsp이름 자동 url 동일. hello3.jsp
		
		
	}
	
//	@RequestMapping("/hello4")
//	public String d(Model m)  { //매핑메소드리턴타입 String--model없고 -jsp이름 자동 url 동일.hello3.jsp
//		HelloDTO dto = new HelloDTO();
//		dto.setMessage("컨트롤러가 view로 전달하는 모델입니다.");
//		m.addAttribute("model", dto);
//		return "hello";
//	}

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
