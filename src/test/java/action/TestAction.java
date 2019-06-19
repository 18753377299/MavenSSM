package action;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

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
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Resource rs=new FileSystemResource("beans.xml");
		BeanFactory ctx=new XmlBeanFactory(rs);
		
		Action action = (Action) ctx.getBean("TheAction");
//		System.out.println(action.getMessage());
		System.out.println(action.execute("Rod Johnson"));
		
		
	}
}
