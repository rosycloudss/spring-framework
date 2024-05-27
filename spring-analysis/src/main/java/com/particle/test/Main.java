package com.particle.test;

import com.particle.test.bean.XmlFactoryTestBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * spring
 * com.particle.test.Main
 *
 * @author liwei
 * @version 1.0.0
 * @since 2024/5/27 0:14
 */
@SuppressWarnings({"serial", "all"})
public class Main {

	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		System.out.println(xmlBeanFactory.getBean("xmlFactoryTextBean", XmlFactoryTestBean.class));;
		System.out.println("执行成功");
	}
}
