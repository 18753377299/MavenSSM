package action;

import com.example.func.risktest.service.EmpService;
import com.example.vo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/beans.xml"})
public class JUnitTest {

    @Autowired
    EmpService empService;

    @Test
    public void test(){
        Emp emp =empService.getEMpById(1);
        System.out.println(emp);
    }

}
