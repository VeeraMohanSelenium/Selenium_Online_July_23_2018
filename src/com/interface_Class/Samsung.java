package com.interface_Class;

public class Samsung implements Mobile,BaseMobile {
	static Mobile m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m = new Samsung();
		m.back_Camera();
		m.front_Camera();
		m.flash();
		m.display();

		m = new Nokia();
		m.back_Camera();
		m.front_Camera();
		m.flash();
		m.display();
		new Nokia().Charger();

	}

	@Override
	public void back_Camera() {
		// TODO Auto-generated method stub
		System.out.println("13Mp  in Samsung");

	}

	@Override
	public void front_Camera() {
		// TODO Auto-generated method stub
		System.out.println("8Mp  in Samsung");

	}

	@Override
	public void flash() {
		// TODO Auto-generated method stub
		System.out.println("Led Flash Samsung");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("gorilla  in Samsung");

	}

	@Override
	public void mp3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		
	}

}
