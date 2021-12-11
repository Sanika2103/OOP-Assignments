import java.util.*;
abstract class Car_Fact{	
	
	//declaration of data member
	String compnay,car_name;
	double price;
	
	//declaration of abstract methods
	abstract void getprice(double price);
	abstract void detail(String company_name,String car_name);
	abstract void accessories();
	//declaration and implentation of input method
		void input_data() {
			Scanner sc =new Scanner (System.in);//creating object of scanner class
			System.out.print("Company Name- ");
			 compnay=sc.next();//taking input from user
			System.out.print("Car Name- ");
			 car_name=sc.next();//taking input from user
			System.out.print("Expected Budget(in Lakhs)- ");
			 price=sc.nextDouble();//taking input from user
		}
		void display_data(Car_Fact obj1) {
			//calling the methods//
			obj1.getprice(price);//calling getprice method
			System.out.println("\n-----------------------------------");
			obj1.detail(compnay, car_name);//calling detail method
			System.out.println("\n-----------------------------------");
			obj1.accessories();//calling accessories method
			System.out.println("\n-----------------------------------");
		}
		
}
class mini_car extends Car_Fact{
	String response;
	//method for getprice 
		public void getprice(double price) {
			if(price>2&&price<5) 
				response="Not Available";	
			else 
				response="Available";	
			
		}
		//method for displaying car detail//
		public void detail(String company_name,String car_name) {
			System.out.println("Company Name- "+company_name);
			System.out.println("Name of Car- "+car_name);
			System.out.println("Color- Black/White/blue/Orange/Red");
			System.out.println("Fuel- Petrol");
			System.out.println("Gears- Manual");
		}
		//method to display accessories of car//
		public void accessories() {
			System.out.println("Types of Tyres- Alloy Wheels");
			System.out.println("Airbags- "+response);
			System.out.println("Back Wiper- "+response);
			System.out.println("Side Mirror- Two");
			System.out.println("Touch Screen Music Player- "+response);
		}
}

class Sedan extends Car_Fact{
	String respone;//declaration of data member
	
	//method for getprice 
	public void getprice(double price) {	
		if(price>6&&price<10) 
			respone="Not Available";	
		else 
			respone="Available";	
	}
	
	//method for displaying car detail//
	public void detail(String company_name,String car_name) {
		System.out.println("Company- "+company_name);
		System.out.println("Name of Car- "+car_name);
		System.out.println("Color- Black/White/Orange/Red");
		System.out.println("Fuel- Petrol/Diesel");
		System.out.println("Gears- Auto/Manual");
	}
	
	//method to display accessories of car//
	public void accessories() {
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- Available");
		System.out.println("Back Wiper- Available");
		System.out.println("Side Mirror- Two");
		System.out.println("Touch Screen Music Player- Available");
		System.out.println("Roof Window- "+respone);
	}
}
class Luxary extends Car_Fact{
	String response;//declaration of data member
	
	//method for getprice 
	public void getprice(double price) {
		if(price>10&&price<14) 
			response="Not Available";	//modify Ans
		else 
			response="Available";	//modify Ans
	}
	
	//method for displaying car detail//
	public void detail(String company_name,String car_name) {
		System.out.println("Company- "+company_name);
		System.out.println("Name of Car- "+car_name);
		System.out.println("Color- Black/White/Orange/Red");
		System.out.println("Fuel- Diesel");
		System.out.println("Gears- Auto");
	}
	
	//method to display accessories of car//
	public void accessories() {
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- Available");
		System.out.println("Back Wiper- Available");
		System.out.println("Side Mirror- Two");
		System.out.println("Touch Screen Music Player- Available");
		System.out.println("Roof Window- Available");
		System.out.println("Automotive Garbage Cans- "+response);
		System.out.println("Automotice Air Freshner- "+response);
		System.out.println("Button Start- "+response);
	}
}


public class fdp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		int c;
		//double price;
		Car_Fact obj;// object of reference Car_Factory
		while(true){
			//menu driven
			System.out.println("Which Car you want to See?- ");
			System.out.println("\n\t1.Small Car\n\t2.Sedan Car\n\t3.Luxary Car\n\t4.Exit");
			c=sc.nextInt();//taking input from user
			System.out.println();
			//switch case
			switch(c) {
	
				case 1:
					obj= new mini_car(); //creating object of Small_car
					obj.input_data();//calling input method
					obj.display_data(obj);//calling display method
					break;
					
				case 2:
					obj= new Sedan();//creating object of Sedan
					obj.input_data();//calling input method
					obj.display_data(obj);//calling display method
					break;
					
				case 3:
					obj= new Luxary();//creating object of Luxary
					obj.input_data();//calling input method
					obj.display_data(obj);//calling display method
					break;
					
				case 4:
					System.out.println("\n-----------------------------------\nProgram Terminated");
					return;//stop execution of program
					
				default:
					System.out.println("INVALID CHOICE !!");//default 
					System.out.println("\n-----------------------------------");
					break;
				
			}
		}
	}
}

// ****OUTPUT*****

//Which Car you want to See?- 
//
//		1.Small Car
//		2.Sedan Car
//		3.Luxary Car
//		4.Exit
//	2
//
//	Company Name- suzuki
//	Car Name- swift
//	Expected Budget(in Lakhs)- 7
//
//	-----------------------------------
//	Company- suzuki
//	Name of Car- swift
//	Color- Black/White/Orange/Red
//	Fuel- Petrol/Diesel
//	Gears- Auto/Manual
//
//	-----------------------------------
//	Types of Tyres- Alloy Wheels
//	Airbags- Available
//	Back Wiper- Available
//	Side Mirror- Two
//	Touch Screen Music Player- Available
//	Roof Window- Not Available
//
//	-----------------------------------
//	Which Car you want to See?- 
//
//		1.Small Car
//		2.Sedan Car
//		3.Luxary Car
//		4.Exit
//	1
//
//	Company Name- yamaha
//	Car Name- alto
//	Expected Budget(in Lakhs)- 3
//
//	-----------------------------------
//	Company Name- yamaha
//	Name of Car- alto
//	Color- Black/White/blue/Orange/Red
//	Fuel- Petrol
//	Gears- Manual
//
//	-----------------------------------
//	Types of Tyres- Alloy Wheels
//	Airbags- Not Available
//	Back Wiper- Not Available
//	Side Mirror- Two
//	Touch Screen Music Player- Not Available
//
//	-----------------------------------
//	Which Car you want to See?- 
//
//		1.Small Car
//		2.Sedan Car
//		3.Luxary Car
//		4.Exit
//	4
//
//
//	-----------------------------------
//	Program Terminated
//	

