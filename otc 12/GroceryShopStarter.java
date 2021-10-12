class GroceryShopStarter{
	
	public static void main(String[] items){
		
		GroceryShop groceryShop = new GroceryShop();
		GroceryShop royalMartItems = new GroceryShop(1,GroceryShopItems.MEAT,822.56);
		
        System.out.println("2nd order");
		
		int totalItems = royalMartItems.noOfItems;
		totalItems = 1;
		System.out.println("Total Items : "+totalItems);
		
		GroceryShopItems item = royalMartItems.items;
		item = GroceryShopItems.MEAT;
		System.out.println("Item ordered : " +item);
		
		double price = royalMartItems.totalAmount;
		price = 600.2;
		System.out.println("Item Price : "+price);
		}
}