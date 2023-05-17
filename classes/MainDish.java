package classes;

import java.lang.*;

public class MainDish extends FoodItem
{
	private String category;
	
	public MainDish()
	{
		super();
		System.out.println("E-MD");
	}
	public MainDish(String fid, String name, int availableQuantity ,double price, String category)
	{
		super(fid, name, availableQuantity, price);
		/*this.name = name;
		this.fid = fid;
		this.availableQuantity = availableQuantity;
		this.price = price;*/
		this.category = category;
		System.out.println("P-MD");
	}
	public void setCategory(String category){this.category = category;}
	public String getCategory(){return category;}
	public void showInfo()
	{
		System.out.println("Food Name : "+name);
		System.out.println("Food id is : "+fid);
		System.out.println("Food available is : "+availableQuantity);
		System.out.println("Food price is : "+price);
		System.out.println("FOOD Category : "+category);
	}
	
	public void showExistingFoodItemID()
	{
		System.out.println("***********************************");
		System.out.println("Food id is : "+fid);
		System.out.println("***********************************");
	}
	
}