package springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ArrayList<String> list = new ArrayList();
		
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("최길동");
		list.add("나길동");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberlist", list);
		mv.setViewName("list");
		
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
