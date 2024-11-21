package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails(){
		System.out.println("El nombre es " + this.name + " " + this.surname +
				" y profesor de " + this.area);
	}
}
