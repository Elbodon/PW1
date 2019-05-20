import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class ServletListener implements ServletContextListener{
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        Integer reqAtual = new Integer(0);
        servletContext.setAttribute("RequisicoesSolicitadas", reqAtual);

    }

    public void contextDestroyed(ServletContextEvent event) {

    }

}
