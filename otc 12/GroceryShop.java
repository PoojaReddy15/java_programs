class GroceryShop{
	String groceryShopName;
	int noOfItems;
	GroceryShopItems items;
	double totalAmount;
	String location;
	long contactNo;
	
	GroceryShop(){
		this(6363132564L);
		System.out.println("-----------------invoked no-arg constructor----------------");
		this.groceryShopName = "Royal Mart";
		this.location = "TC Palya,Banglore";
		
	}
	
	GroceryShop(String groceryShopName,String location){
		System.out.println("-------------------invoked String groceryShopName,String location----------------------------");
		System.out.println("Name of Grocery Shop : " +groceryShopName);
		System.out.println("Location of Grocery Shop : " +location);
		
		}
	
	GroceryShop(long contactNo){
		this("Royal Mart","TC Palya,Banglore");
		System.out.println("---------------------------invoked long contactNo----------------------");
		System.out.println("Contact no of Grocery Shop : " +contactNo);
		
	}
	
	GroceryShop(int totalItems,GroceryShopItems Items,double amount){
		System.out.println("-----------------invoked 3 constructor------------------");
		System.out.println("1st order");
		this.items = items;
		items = GroceryShopItems.CHEESE;
		this.noOfItems = totalItems;
		totalItems =1;
		this.totalAmount = amount;
		amount = 500.99;
		System.out.println("Total Items : " +totalItems);
		System.out.println("Items : " +items);
		System.out.println("Contact no of Grocery Shop : " +amount);
		
		
	}
}