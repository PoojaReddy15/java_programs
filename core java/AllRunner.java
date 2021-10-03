class AllRunner{
	public static void main(String[] values){
		System.out.println("All methods runner");
		
		System.out.println("Printer");
		Printer.printViaBluetooth();
		Printer.ScanAndPrint();
		
		System.out.println("Speaker");
		Speaker.playsMusic();
		Speaker.playsFm();
		
		System.out.println("Camera");
		Camera.photography();
		Camera.videography();
	}
}