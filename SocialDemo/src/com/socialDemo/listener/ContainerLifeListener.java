package com.socialDemo.listener;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.socialDemo.bean.JDBCDatabase;

/**
 * Application Lifecycle Listener implementation class ContainerLifeListener
 *
 */
@WebListener
public class ContainerLifeListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContainerLifeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent e)  { 
//    	ServletContext context = e.getServletContext();
//    	JDBCDatabase database = (JDBCDatabase) context.getAttribute("database");
//    	
//    	try {
//    		database.getConnection().close();
//    	}catch(SQLException exc) {
//    		exc.printStackTrace();
//    	}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e)  { 
//    	JDBCDatabase database = new JDBCDatabase();
//    	
//    	ServletContext context = e.getServletContext();
//    	
//    	context.setAttribute("database", database);
//    	
//    	
    }
	
}
