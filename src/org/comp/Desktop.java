package org.comp;

public  class Desktop implements Hardware, Software{
	
	public void desktopModel() {
		System.out.println("Desktop model is Dell");
	}
	
	//@Override
	public void hardwareResourses() {
		System.out.println("Hardware Resourses");
	}
	
	//@Override
	public void softwareResourses() {
		System.out.println("Software Resourses");
	}
		
		
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResourses();
	d.softwareResourses();
		}
how r u;
}
