package aop.animal2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect 
//@EnableAspectJAutoProxy (proxyTargetClass = true)
public class AnimalAspect {
	@Pointcut("execution (public String aop.animal2.*.lunch()) ")
	
	void a() {}
	
	@Around("a()")
	public void around(ProceedingJoinPoint p) {
		try {
		String target = p.getTarget().toString();	//aop.animal1.dog@16진수
		String names[] = target.split("@")[0].split("//.");
		String classname = names[names.length-1];
		Object o = p.proceed();
		System.out.println(classname + "-" + o + " 먹었군요.");
		//Dog-사료 먹었군요.
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	
}