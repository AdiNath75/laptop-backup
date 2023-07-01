package com.designpattern.factory.demo;

abstract class Vehicle {

	public abstract int getWheel();

	public String toString() {

		return "Wheel: " + this.getWheel();
	}
}

class Car extends Vehicle {

	int Wheel;

	Car(int Wheel) {
		this.Wheel = Wheel;
	}

	@Override
	public int getWheel() {
		return this.Wheel;
	}
}

class Bike extends Vehicle {

	int Wheel;

	Bike(int Wheel) {
		this.Wheel = Wheel;
	}

	@Override
	public int getWheel() {
		return this.Wheel;
	}
}

class VehicleFactory{
	public static Vehicle getInstance(String type, int wheel) {
		if(type == "car") {
			return new Car(wheel);
		}else if(type == "bike") {
			return new Car(wheel);
		}
		return null;
	}
}

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("car", 4);
		
		System.out.println(car);
		
		Vehicle bike = VehicleFactory.getInstance("bike", 2);
		
		System.out.println(bike);

	}

}
