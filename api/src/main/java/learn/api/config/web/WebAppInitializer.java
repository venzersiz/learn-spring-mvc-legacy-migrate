package learn.api.config.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        XmlWebApplicationContext rootAppContext = new XmlWebApplicationContext();
        rootAppContext.setConfigLocation("/WEB-INF/spring/applicationContext.xml");

        servletContext.addListener(new ContextLoaderListener(rootAppContext));


        XmlWebApplicationContext servletAppContext = new XmlWebApplicationContext();
        servletAppContext.setConfigLocation("/WEB-INF/spring/servletContext.xml");

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(servletAppContext));

        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
    }
}
