package test;




 
	class demo extends Thread {
		@Override
		public void run() {
			for(int dec=1;dec<=10;dec++) {
				System.out.println("printdocument"+dec+"-print1");
			}
		}
public static void main(String[] args) {
	//task1
	System.out.println("App execution started");
	
	//task2
	demo td=new demo();
	td.start();
	
	//task3
	for(int dec=1;dec<=10;dec++) {
		System.out.println("printdocument"+dec+"-print2");
	
	}
	System.out.println("App execution completed");
	
}
}
