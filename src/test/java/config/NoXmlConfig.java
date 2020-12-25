package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration： 这个也会被spring容器进行托管，注册到容器中，因为他本来就是一个@Component
 * @Import 可以直接引入其他的配置文件。
*/
@Configuration
public class NoXmlConfig {
	
	@Bean 
	public String result() {
		return "success";
	}
}
