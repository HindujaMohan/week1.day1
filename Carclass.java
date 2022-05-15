package week1.day1;

public class Carclass {
	
	public void applyBreak() {
		System.out.println("Apply the break");	
	}
	public void applyGear() {
		System.out.println("Apply Gear 1");
	}
	public void switchOnAc() {
		System.out.println("Switch on the AC");
	}
	public void applyAcclerate() {
		System.out.println("Apply the acclerator and put 3rd gear");
	}
	public static void main(String[] args) {
		System.out.println("Driving steps : NEXA");
		System.out.println("..................");
		// TODO Auto-generated method stub
		
		Carclass myCarClass = new Carclass();
		myCarClass.applyBreak();
		myCarClass.applyGear();
		myCarClass.switchOnAc();
		myCarClass.applyAcclerate();
		
	}

}
