package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
	BeanFactory beanFactory=null;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory=beanFactory;
		System.out.println("Factory is instantiated !!");
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		name="mybean";
		System.out.println("setBeanName() is invoked!!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after propertiesSet() is invoked !!");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean is destroyed!!");
		
	}

}
