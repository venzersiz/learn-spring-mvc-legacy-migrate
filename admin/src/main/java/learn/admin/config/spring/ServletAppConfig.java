package learn.admin.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "learn.admin", includeFilters = @Filter(org.springframework.stereotype.Controller.class))
public class ServletAppConfig {

}
