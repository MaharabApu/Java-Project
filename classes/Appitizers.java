package classes;

import java.lang.*;

public class Appitizers extends FoodItem
{
	private String size;
	
	public Appitizers()
	{
		super();
		System.out.println("E-AP");
	}
	public Appitizers(String name, String fid, int availableQuantity ,double price, String size)
	{
		super(name, fid, availableQuantity, price);
		/*this.name = name;
		this.fid = fid;
		this.availableQuantity = availableQuantity;
		this.price = price;*/
		this.size = size;
		System.out.println("P-AP");
	}
	public void setSize(String size){this.size = size;}
	public String getSize(){return size;}
	public void showInfo()
	{
		System.out.println("Food Name : "+name);
		System.out.println("Food id is : "+fid);
		System.out.println("Food available is : "+availableQuantity);
		System.out.println("Food price is : "+price);
		System.out.println("FOOD Size : "+size);
	}
	
	public void showExistingFoodItemID()
	{
		System.out.println("***********************************");
		System.out.println("Food id is : "+fid);
		System.out.println("***********************************");
	}
	
}