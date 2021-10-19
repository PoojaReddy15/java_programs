class CameraRunner{
	public static void main(String[] args){
		Camera camera = new Camera();
		String brand = camera.getBrand();
		if(brand!=null){
			System.out.println("Brand : " + brand);
		}
		else {
			System.out.println("System is not pointing to any memory");
		}
		
		System.out.println("Getter method");
        System.out.println("Brand : " + camera.getBrand());
		System.out.println("Model : " + camera.getModel());
		System.out.println("Pixel : " + camera.getPixel());
		System.out.println("Price : " + camera.getPrice());
		System.out.println("Brand : " + camera.getResolution4K());
        
		Camera camera1 = new Camera();
		System.out.println("Setter method");
        camera1.setBrand("nikon");
        camera1.setModel("1500B");
		camera1.setPixel(20);
		camera1.setPrice(55000.00);
		camera1.setResolution4K(false);
        		
		
	}
}