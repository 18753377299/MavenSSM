package action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.func.risktest.service.EmpService;

/**
 * 
 * AOP需要org.aspectj   ---- aspectjweaver的包
 * 方式三 ：使用注解实现
 *  
 *  */

public class AOPTest {
	@Test
   public  void testAopLog() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/beans.xml");
		EmpService empService = (EmpService) ctx.getBean("empService");
		empService.getEMpById(1);
   }
}
