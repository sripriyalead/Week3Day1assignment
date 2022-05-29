package org.system;

public class Desktop extends Computer{

	public void desktopSize() {System.out.println("Size of Desktop is 25");}

public static void main(String[] args) {
	Desktop dt = new Desktop();
	dt.computerModel();
	dt.desktopSize();
}
}