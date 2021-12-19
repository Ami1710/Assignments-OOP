package org.system;

/*
Package   :org.system
Class        :Computer
Methods   :computerModel()

Class        :Desktop
Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.*/


public class Desktop extends Computer{

	public void desktopSize()
	{
		super.computerModel();
		System.out.println("Child Class Desktop:desktopSize Method");
	}
	
	public static void main(String[] args) {

	Desktop dt = new Desktop();
	dt.desktopSize();
	dt.computerModel();
	}

}
