package aop1;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {
	long start = 0;
	
	public void a() {
		start = System.currentTimeMillis();
		System.out.println("===> a메소드는 핵심관심 이전에 호출 : " + new Date(start));
	}
	
	public void b() {
		System.out.println("===> b메소드는 핵심관심 이후에 호출 : " + (System.currentTimeMillis() - start) + " 소요시간(1/1000초)");
	}
	
	//이전 + 이후 모두 실행되는 메소드
	public void c(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("===> c메소드는 핵심관심 이전에 호출 : ");
			System.out.println("타겟클래스객체 = " + joinpoint.getTarget());
			System.out.println("타겟메소드 = " + joinpoint.toLongString());
			Object[] args = joinpoint.getArgs();
			for(Object o : args) {
				System.out.println("매개변수 = " + o);
			}
			
			Object returnVal = joinpoint.proceed();
			if(returnVal != null) {
				System.out.println("리턴값 = " + returnVal);
			}
//			System.out.println(returnVal);
			System.out.println("===> c메소드는 핵심관심 이후에 호출 : ");
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
}

/* aop1패키지 내의 모든 클래스 실행 이전에 a 메소드 실행될 수 있도록 구성 - spring xml 태그에 설정해야함 /
 * <bean id="common" class="aop1.Common" />
 * <aop:config>
 *   <aop:pointcut expression="( * aop1.*.*(..))" id="pc" />
 *   <aop:aspect id="aopaspect" ref="common"/>
 *   <aop:before method="a" pointcut-ref="pc" />
 *   
 * 
 * 
 * </aop:config>
 *  */
