package spring.tv;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext
				("spring/tv/tv.xml");
		
		TV tv = (TV)factory.getBean("tv2", TV.class);
		tv.powerOn();
		tv.soundUp(5);
		tv.soundDown(3);
		tv.powerOff();
		
		TV tv2 = (TV)factory.getBean("tv2");
		TV tv3 = (TV)factory.getBean("tv2");
	}
}

/* 개발자 - 일부 코드 수정시에 같이 따라서 변경 부분 많아진다. --> 최소화
 * 인터페이스 공통 기능 명세서 각각 tv들은 공통 메소드 구현 약속
 * 외부공장 전달받은 TV 사용 - MAIN(객체생성제어권 -- 팩토리)
 * 
 * 1> inversion of control(IOC)
 * 2> POJO 클래스 사용 가능
 * 3> 프로그램 구현 형식 - 자바 디자인 패턴 factory - 내장 factory pattern + 인터페이스 - ioc
 * 4> singleton pattern - 1개 생성 공유
 * 
 * xml --> spring --> main
 * 
 * 5> Member
 */