package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //it auto enables annotation support
@ComponentScan(basePackages = {"dependency","dependent"})
public class SpringAppConfiguration {
//Not adding any methods annotated with @Bean :
	// why - since we have ALREADY supplied @Component n informed SC
}
