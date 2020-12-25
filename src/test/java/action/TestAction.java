package action;


import com.Action.Action;
import com.service.facade.Axe;
import com.service.facade.Person;
import com.service.impl.Japan;
import config.NoXmlConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月19日 上午11:16:50
 * @version 1.0 
 * @parameter  
 * @since    对spring的测试
 * @return  */
public class TestAction {
	
	@Test
	public void testQuickStart(){
		
//		ApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
		//从类的加载路径下搜索配置文件，可以加载多个xml文件
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/beans.xml");
		
//		Resource rs=new FileSystemResource("beans.xml");
//		BeanFactory ctx=new XmlBeanFactory(rs);
		
//		Resource resource= new ClassPathResource("beans.xml");
//		/*创建默认的beanfactory容器*/
//		DefaultListableBeanFactory dBeanFactory = new DefaultListableBeanFactory();
//		/*让默认的容器记载xml文件*/
//		new XmlBeanDefinitionReader(dBeanFactory).loadBeanDefinitions(resource);
		
		Action action = (Action) ctx.getBean("TheAction");
//		System.out.println(action.getMessage());
		System.out.println(action.execute(" Rod Johnson"));
		/*依赖注入*/
		Person person = ctx.getBean("chinese", Person.class);
		person.useAxe();
		/*构造注入*/
		Axe axe = ctx.getBean("stoneAxe",Axe.class);
		Person p2 =new Japan(axe);
		p2.useAxe();
		/*依赖注入*/
		Person p = ctx.getBean("japan",Person.class);
		p.useAxe();
	}
	/*使用@Configuration注解完全代替xml配置文件*/
	@Test
	public void testNoXml() {
		ApplicationContext  applicationContext = new AnnotationConfigApplicationContext(NoXmlConfig.class);
		String result = (String)applicationContext.getBean("result");
		System.out.println("=============>>"+result);
	}



	
	
	
	
	
}
