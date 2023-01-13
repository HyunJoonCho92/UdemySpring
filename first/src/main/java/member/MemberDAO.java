package member;

public class MemberDAO {
	MemberDTO dto;

//	<property name="dto" ref="dto정의 bean id">
	public void setDto(MemberDTO dto) {
		//dto1, dto2, dto3+ 하위클래스객체(ioc, 구현)
		//dependency INJECTION
		// 1> SETTER INJECTION
		// 2> GETTER INJECTION
		
		this.dto = dto;
	}
	public boolean selectMember() {
		//MemberDTO - id spring 이고 pw 1111이면 정상 로그인
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 님 회원가입되셨습니다.");
	}
	
	
}
