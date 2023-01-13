package aop.animal1;

import org.aspectj.lang.ProceedingJoinPoint;

public class AnimalAspect {
	
//	public void before() {
//		System.out.println("오늘은 뭐 먹을거예요");
//		
//	}
	
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