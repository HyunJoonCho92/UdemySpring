package annotation.springmvc0113_1;

public interface MemberService {
	
	//기능 메소드 선언
	//두 함수 기능은 같음
	public void registerMember() ;//콘솔
	
	String registerMember(MemberDTO dto);//spring mvc
}
