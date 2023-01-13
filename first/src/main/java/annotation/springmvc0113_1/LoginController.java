package annotation.springmvc0113_1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
//	@RequestMapping("/loginform")
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("login")
	public String loginform() {
		
		return "loginform";
	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@PostMapping("login")
//	public ModelAndView loginprocess(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		// db에서 로그인 정상 확인했다고 가정
//		LoginDTO dto = new LoginDTO();
//		dto.setId(id);
//		dto.setPw(pw);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("loginresult", dto);
//		
//		mv.setViewName("loginsuccess"); //loginsuccess에 보내준다.
//		
//		return mv;
//	}
	
	
//	@PostMapping("login")
//	public ModelAndView loginprocess(LoginDTO dto, int age) {  // --dto.setId(id)(request.getParameter("id"))
//
//		System.out.println(age);
//		// db에서 로그인 정상 확인했다고 가정하고 진행
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("loginresult", dto);
//		
//		mv.setViewName("loginsuccess"); //loginsuccess에 보내준다.
//		
//		return mv;
//	}
	
	@PostMapping("login")
	public String loginprocess(@ModelAttribute("loginresult") LoginDTO dto) {  // --dto.setId(id)(request.getParameter("id"))
		
		return "loginsuccess";
	}
	
	@ModelAttribute("all")
	public String all() {
		
		return "모두 뷰에서 사용 가능합니다.";
	}
	

}