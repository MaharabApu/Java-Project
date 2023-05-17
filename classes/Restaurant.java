package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem FoodItems[];
	
	public Restaurant()
	{
		System.out.println("E-Restaurant");
		this.FoodItems = new FoodItem [20];
	}
	
	public Restaurant(String rid, String name, int sizeOfArray)
	{
		System.out.println("P-Restaurant");
		this.rid = rid;
		this.name = name;
		this.FoodItems = new FoodItem [sizeOfArray];
	}
		
	public void setRid(String rid){this.rid = rid;}
	public void setName(String name){this.name = name;}
	
	
	public String getRid(){return rid;}
	public String getName(){return name;}
	
	public boolean insertFoodItem(FoodItem f)
	{
		boolean flag = false;
		
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] == null)
			{
				FoodItems[i] = f;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFoodItem(FoodItem f)
	{
		boolean flag = false;
		
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] == f)
			{
				FoodItems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllFoodItems()
	{
		System.out.println("*****************************************");
		System.out.println("Restaurant RID : "+ rid);
		System.out.println("Restaurant Name : "+ name);
		
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] != null)
			{
				System.out.println("--------------------");
				FoodItems[i].showInfo();
				System.out.println();
			}
		}
	}
	
	public FoodItem searchFoodItem(String fid)
	{
		FoodItem f = null;
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] != null)
			{
				if(FoodItems[i].getFid().equals(fid))
				{
					f = FoodItems[i];
					break;
				}
			}
		}
		return f;
	}
	
	public void showExistingFoodItemID()
	{
		
		
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] != null)
			{
				System.out.println("--------------------");
				FoodItems[i].showExistingFoodItemID();
				System.out.println();
			}
		}
	}
	
	public void removeFoodItem(String fid)
	{
		boolean flag=true;
		
		for(int i=0; i<FoodItems.length; i++)
		{
			if(FoodItems[i] != null)
			{
				(FoodItems[i].getFid()).equals(fid);
				FoodItems[i]=null;
				flag=false;
				System.out.println();
			}
		}
				if(!flag){		System.out.println("Removed");}
		       else{		System.out.println("Not Removed");}

	}
}