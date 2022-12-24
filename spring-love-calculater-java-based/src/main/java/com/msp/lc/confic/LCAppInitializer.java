package com.msp.lc.confic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr = {LoveCalculatorAppConfic.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = {"/"};
		return arr;
	}

}
