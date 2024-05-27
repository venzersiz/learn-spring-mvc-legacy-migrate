package learn.admin.config.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer {

    public void onStartup(ServletContext servletContext) {

        // ~ Root application context
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.setConfigLocation("learn.api.config");

        servletContext.addListener(new ContextLoaderListener(appContext));

        // ~ Servlet application context
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(appContext));

        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
    }
}
