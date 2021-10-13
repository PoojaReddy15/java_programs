class Bicycle{
	
	String brand = "Altas";
	String color = "black";
	double price = 9999.99;
	BicycleType type = BicycleType.WITHOUTGEAR;
	
	void brake(){
		System.out.println("invoked break method");
	}
	
	void move(){
		System.out.println("invoked move method");
		
	}
		
	void displayDetails(){
		System.out.println("Bicycle Brand : " + this.brand);
		System.out.println("Bicycle Color : " + this.color);
		System.out.println("Bicycle Price : " + this.price);
		System.out.println("Bicycle Type : " + this.type);
		
	}
}
