package action;


import com.service.impl.Chinese;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring/beans.xml"})
@ContextConfiguration(locations={"file:src/main/resources/spring/beans.xml"})
@WebAppConfiguration
public class JUnitTest {

//    @Autowired
//    private EmpService empService;

    @Autowired
     private Chinese chinese;

    @Test
    public void test(){
//        Emp emp =empService.getEMpById(1);
//        System.out.println(emp);
        System.out.println(chinese.getAxe());
    }

}
