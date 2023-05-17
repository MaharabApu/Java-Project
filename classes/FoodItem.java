package classes;


import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public FoodItem(){System.out.println("E-F");}
	public FoodItem(String fid, String name, int availableQuantity, double price)
	{
		this.fid = fid;
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
		System.out.println("P-F");
	}
	
	public void setName(String name){this.name = name;}
	public void setFid(String fid){this.fid = fid;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	public void setPrice(double price){this.price = price;}
	
	public String getName(){return name;}
	public String getFid(){return fid;}
	public int getAvailableQuantity(){return availableQuantity;}
	public double getPrice(double price){return price;}
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			availableQuantity = availableQuantity + amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<= availableQuantity)
		{
			availableQuantity = availableQuantity - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract void showExistingFoodItemID();
	public abstract void showInfo();
}