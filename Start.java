import java.lang.*;
import fileio.*;
import java.util.*;
import classes.*;

public class Start
{
	public static void main(String args[])
	{
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);		//creating an object of Scanner class for taking input from user.
													//nextInt() -> method to take an int as input
													//nextDouble() -> method to take a double as input
													//next() -> method to take a String as input. Condition: no spaces. Only a word. 
													//next().charAt(0) -> method to take a char as input.
		
		boolean repeat = true;
		
		System.out.println("************************");
		System.out.println("Welcome to Monster FoodCourt");
		System.out.println("************************");
		System.out.println();
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setName(name1);
							e1.setEmpId(empId1);
							e1.setSalary(salary1);
							
							if(f.insertEmployee(e1)){System.out.println("Employee Inserted... ID: "+empId1);}
							else{System.out.println("Oops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId3 = sc.next();
							
							Employee e3 = f.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(f.removeEmployee(e3)){System.out.println("Employee Removed...... ID: "+e3.getEmpId());}
								else{System.out.println("Oops... Something is Wrong...");}
							}
							else{System.out.println("Sorry... No Employee Found to Remove.....");}
							
							System.out.println();
							
							break;
							
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							System.out.println();
							
							f.showAllEmployees();
							
							break;
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = f.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found...........");
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Id: "+e2.getEmpId());
								System.out.println("Employee Salary: "+e2.getSalary());
							}
							else{System.out.println("Sorry... No Employee Found.....");}
							
							System.out.println();
							
							break;
							
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Restaurant Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove Existing Restaurant");
					System.out.println("3. Show All Restaurants");
					System.out.println("4. Search a Restaurant");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Restaurant");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant RID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							
							Restaurant r1 = new Restaurant();
							
							r1.setRid(rid1);
							r1.setName(name1);
							
							
							if(f.insertRestaurant(r1)){System.out.println("Restaurant inserted.. RID: "+r1.getRid());}
							else{System.out.println("Oops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Restaurant");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant RID: ");
							String rid3 = sc.next();
							
							Restaurant r3 = f.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								if(f.removeRestaurant(r3)){System.out.println("Restaurant Removed...... ID: "+r3.getRid());}
								else{System.out.println("Oops... Something is Wrong...");}
							}
							else{System.out.println("Sorry... No Restaurant Found to Remove.....");}
							
							System.out.println();
							
							break;
							
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Restaurants");
							System.out.println("***********************************");
							f.showAllRestaurants();
							
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Restaurant");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant Rid: ");
							String rid2 = sc.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								System.out.println("Restaurant Found...........");
								System.out.println("Restaurant Id: "+r2.getRid());
							    System.out.println("Restaurant Name: "+r2.getName());
							}
							else{System.out.println("Sorry... No Restaurant Found.....");}
							
							System.out.println();
							
							break;
							
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 3:
					
					System.out.println("*******************************************");
					System.out.println("Your Choice is: Restaurant FoodItem Management");
					System.out.println("*******************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New FoodItem");
					System.out.println("2. Remove Existing FoodItem");
					System.out.println("3. Show All FoodItems");
					System.out.println("4. Search a FoodItem");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New FoodItem");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.println("There are Two Types of FoodItem: ");
							System.out.println("1. MainDish");
							System.out.println("2. Appetizers");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							FoodItem fi = null;
							
							if(type == 1)
							{
								System.out.println("Your Type is: MainDish");
								
								System.out.print("Enter FoodItem FID: ");
								String fid = sc.next();
								System.out.print("Enter FoodItem Name: ");
								String name = sc.next();
								System.out.print("Enter AvailableQuantity: ");
								int availableQuantity = sc.nextInt();
								System.out.print("Enter FoodItem price: ");
								double price = sc.nextDouble();
								System.out.print("Enter FoodItem category: ");
								String category = sc.next();
								
								MainDish md = new MainDish(fid,name,availableQuantity,price,category);
								
								fi = md;
								
							}
							else if(type == 2)
							{
								System.out.println("Your Type is: Appetizers");
								
								System.out.print("Enter FoodItem FID: ");
								String fid = sc.next();
								System.out.print("Enter FoodItem Name: ");
								String name = sc.next();
								System.out.print("Enter AvailableQuantity: ");
								int availableQuantity = sc.nextInt();
								System.out.print("Enter FoodItem price: ");
								double price = sc.nextDouble();
								System.out.print("Enter FoodItem size: ");
								String size = sc.next();
								
								Appitizers ap = new Appitizers(fid,name,availableQuantity,price,size);
								
								fi = ap;
							}
							else if(type == 3)
							{
								System.out.println("Your Type is to Go Back");
							}
							else
							{
								System.out.println("Inavlid Type...........");
							}
							
							if(fi != null)
							{
								System.out.print("Enter Restaurant RID: ");
								String rid1 = sc.next();
								
								Restaurant r1 = f.searchRestaurant(rid1);
								
								if(r1 != null)
								{
									if(r1.insertFoodItem(fi)){System.out.println("FoodItem inserted....");}
									else{System.out.println("FoodItem Not Inserted");}
								}
								else{System.out.println("Oops Someting is Worng");}
							}
							
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing FoodItem");
							System.out.println("***********************************");
							
							System.out.println("Input a Restaurent ID of whom you want to remove a Item: ");
							String rid = sc.next();
							Restaurant ItemRemove = f.searchRestaurant(rid);
							if(ItemRemove!=null)
							{
								
							System.out.println("Existing Food Items ID given Below:");
							ItemRemove.showExistingFoodItemID();
							System.out.println("***********************************");
							System.out.println("Input a Food Item ID you want to remove: ");
							String fid=sc.next();
							
							
								
								ItemRemove.removeFoodItem(fid);
							
							
							
							}
							else {System.out.println("Unable a to find a Restaurent");}
							
							System.out.println();
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All FoodItems");
							System.out.println("***********************************");
							System.out.println("Input a Restaurent ID of whom you want to Show ALl Food Item: ");
							String rid2=sc.next();
							Restaurant show=f.searchRestaurant(rid2);
							if(show!=null)
							{
								show.showAllFoodItems();
							}
							else System.out.println("Unable a to find a Restaurent");
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a FoodItem");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
								
							Restaurant r4 = f.searchRestaurant(rid4);
							
							if(r4 != null)
							{
							
							    System.out.println("Existing Food Items ID given Below:");
							    r4.showExistingFoodItemID();

							    System.out.println("Enter an ID to show Info:");
							    String fid4=sc.next();
							    FoodItem showInfo=r4.searchFoodItem(fid4);
							    showInfo.showInfo();
							}
							else{System.out.println("No Restaurant Found");}
								
							
							
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Go Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("************************************");
					System.out.println("Your Choice is: FoodItem Quantity Add-Sell");
					System.out.println("************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1.Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Add FoodItem");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter RID: ");
							String rid1 = sc.next();
							
							Restaurant r1 = f.searchRestaurant(rid1);
							
							if(r1 != null)
							{
								System.out.print("Enter FoodItem FID: ");
								String fid = sc.next();
								
								FoodItem fii = r1.searchFoodItem(fid);
								
								if(fii != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Quantity: "+fii.getAvailableQuantity());
									if(fii.addQuantity(am))
									{
										System.out.println("Adding Amount: "+am + "  Successfull ");
										System.out.println("New Quantity: "+fii.getAvailableQuantity());
										frwd.writeInFile(am + " has been added in "+ fii.getFid());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							}
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Sell FoodItem");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter RID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = f.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								System.out.print("Enter FoodItem FID: ");
								String fid = sc.next();
								
								FoodItem fi = r2.searchFoodItem(fid);
								
								if(fi != null)
								{
									System.out.print("Enter Amount: ");
									int am = sc.nextInt();
									System.out.println("Current Quantity: "+fi.getAvailableQuantity());
									if(fi.sellQuantity(am))
									{
										System.out.println("Selling Amount: "+am + "  Successfull ");
										System.out.println("New Quantity: "+fi.getAvailableQuantity());
										frwd.writeInFile(am + " has been selling from "+ fi.getFid());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							}
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show Add Sell History");
							System.out.println("***********************************");
							
							frwd.readFromFile();
							System.out.println();
							
							break;
				
							
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Go Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 5:
					
					repeat = false;
					System.out.println("******************************");
					System.out.println("Thank You for Using Our System");
					System.out.println("******************************");
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("Invalid Choice");
					System.out.println("******************************");
					System.out.println();
					break;
			}
		}
	}
}
