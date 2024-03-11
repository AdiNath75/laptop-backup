package com.designpattern.prototype.demo;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable{
	
	// add members
	private List<String> vehicleList;
	
	// add constructors
	public Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}
	
	public Vehicle(List<String> list) {
		this.vehicleList = list;
	}
	
	// add data
	public void insertData() {
		vehicleList.add("Toyota Supra");
		vehicleList.add("Nissan GTR");
		vehicleList.add("Mazda RX-7");
		vehicleList.add("Subaru BRZ");
		vehicleList.add("Ford Mustang");
	}
	
	// add getter
	public List<String> getVehicleList(){
		return this.vehicleList;
	}

	// use clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		
		for (String str : this.getVehicleList()) {
			tempList.add(str);
		}
		return new Vehicle(tempList);
	}
}

public class PrototypeDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Vehicle v1 = new Vehicle();
		v1.insertData();
		
		Vehicle v2 = (Vehicle)v1.clone();
		List<String> list = v2.getVehicleList();
		
		list.add("Honda Accord");
		
		System.out.println(v1.getVehicleList());
		System.out.println(list);
		
		v2.getVehicleList().remove("Mazda RX-7");
		System.out.println(list);
		System.out.println(v1.getVehicleList());
		
	}
}
