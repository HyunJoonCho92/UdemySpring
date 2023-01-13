package memberservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {
	public static void main(String args[]) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("memberservice/member.xml");
		
		MemberService service = factory.getBean("service", MemberBasicService.class);
		
		service.registerMember();
		
			
		List<Integer> list = new ArrayList<>();
			
			
			
//		MemberDAO dto2 = new MemberDTO();
//		MemberDAO dto3 = new MemberDTO();;
			
			
			
			
	}

}
