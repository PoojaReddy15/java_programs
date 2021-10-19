class Camera{
	String brand;
	String getBrand(){
		 return this.brand;
	}
	
	String getModel(){
		return "EOS 1500D";
	}
	
	int getPixel(){
		return 12;
	}
	
	double getPrice(){
		return 1800.99;
	}
	
	boolean getResolution4K(){
		return true;
	}
	
	void setBrand(String brand){
		System.out.println("Brand : " + brand);
	}
	void setModel(String model){
		System.out.println("Model : " + model);
	}
	void setPixel(int pixel){
		System.out.println("Pixel : " + pixel);
	}
	void setPrice(double price){
		System.out.println("Price : " + price);
	}
	void setResolution4K(boolean resolution4K){
		System.out.println("Brand : " + resolution4K);
	}
	
}