package com.spring.rest.bean;

public class User {

	/** ��½�� */
	private String loginName;

	/** �û��� */
	private String name;

	/** �Ա� */
	private Integer sex;

	/** ���� */
	private Integer age;

	/** �ֻ��� */
	private String phone;

	/** �û���� */
	private Integer userType;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	
}
