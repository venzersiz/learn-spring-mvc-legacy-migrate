package learn.api.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "learn.api.user", excludeFilters = @Filter(org.springframework.stereotype.Controller.class))
@ImportResource(locations = {"/WEB-INF/spring/persistenceContext.xml"})
public class RootAppConfig {

}
