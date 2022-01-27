package com.acessmodifiers;

public class Private {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Private p1 = new Private();
		p1.setName("vinay");
		System.out.println(p1.getName());
	
	}

}
