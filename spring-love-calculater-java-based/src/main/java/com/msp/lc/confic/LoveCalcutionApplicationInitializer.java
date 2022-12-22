package com.msp.lc.confic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalcutionApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContex = new AnnotationConfigWebApplicationContext();
		webApplicationContex.register(LoveCalculatorAppConfic.class);
		
		// Create a DispatcherServlet Object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContex);
		
		// Register DispatcherServlet with servletContext
		// 'ServletRegistration.Dynamic' <- this isreturn type of addServlet
		// both ServletRegistration, Dynamic are interfaces
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
