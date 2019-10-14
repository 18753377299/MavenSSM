package action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.facade.Axe;
import service.facade.Person;
import service.impl.Japan;

import com.Action.Action;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月19日 上午11:16:50
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class TestAction {
	
	@Test
	public void testQuickStart(){
		
//		ApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
		//从类的加载路径下搜索配置文件
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
//		Resource rs=new FileSystemResource("beans.xml");
//		BeanFactory ctx=new XmlBeanFactory(rs);
		
		Action action = (Action) ctx.getBean("TheAction");
//		System.out.println(action.getMessage());
		System.out.println(action.execute(" Rod Johnson"));
		
		Person person = ctx.getBean("chinese",Person.class);
		person.useAxe();
		
		Axe axe = ctx.getBean("stoneAxe",Axe.class);
		Person p2 =new Japan(axe);
		p2.useAxe();
		
		Person p = ctx.getBean("japan",Person.class);
		p.useAxe();
		
	}
}
