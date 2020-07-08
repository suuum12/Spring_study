package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer   {

	@Override
	protected Class<?>[] getRootConfigClasses() { // root-context.xml
	    return new Class[] {RootConfig.class}; 
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class}; 
	}

	@Override
	protected String[] getServletMappings() { // 스프링 mvc의 기본 경로
		return new String[] { "/" };
	}

}
