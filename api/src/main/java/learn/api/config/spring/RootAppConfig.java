package learn.api.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "learn.api.user", excludeFilters = @Filter(org.springframework.stereotype.Controller.class))
public class RootAppConfig {

}
