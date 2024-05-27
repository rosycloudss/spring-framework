package com.particle.test.bean;

/**
 * spring
 * com.particle.test.bean.XmlFactoryTestBean
 *
 * @author liwei
 * @version 1.0.0
 * @since 2024/5/27 0:12
 */
public class XmlFactoryTestBean {
	private String name = "defaultName";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "XmlFactoryTestBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
