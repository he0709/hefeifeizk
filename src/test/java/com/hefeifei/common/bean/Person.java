package com.hefeifei.common.bean;

import java.util.Date;

/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: hefeifei-common
 * @Package: com.hefeifei.common.bean 
 * @Description: TODO
 * @author: Lenovo   
 * @date: 2019年6月17日 上午9:48:51 
 * @version: V1.0   
 */
public class Person {
	private String name;
	private int age;
	private String about;
	private Date created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	public Person(String name, int age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	
	
}
