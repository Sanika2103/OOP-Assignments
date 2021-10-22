import java.util.*;

// Interface declaration

interface vehicle{
	void gearChange();
	void speedUp(int a);
	void applyBreaks();
}

 class bicycle implements vehicle{
	public void applyBreaks(){
		System.out.println("Breaks are applied");
	}
	public void gearChange(){
		System.out.println("Gears are changed");
	}
	public void speedUp(int a){
		int sp = a+10;
		System.out.println("Bicycle speed is : "+ sp +"kmPhr");
	}
}
 
 class bike implements vehicle{
	public void applyBreaks(){
		System.out.println("");
	}
	public void gearChange(){
		System.out.println("Gears are changed");
	}
	public void speedUp(int a){
		int sp = a+20;
		System.out.println("Bicycle speed is : "+ sp +"kmPhr");
	}
}
 
 class car implements vehicle{
	public void applyBreaks(){
		System.out.println("Breaks are applied");
	}
	public void gearChange(){
		System.out.println("Gears are changed");
	}
	public void speedUp(int a){
		int sp = a+20;
		System.out.println("Bicycle speed is : "+ sp +"kmPhr");
	}
}

public class interace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter 1 : Bicycle \n 2 : Car \n 3 : Bike \n 4 : Exit");
	Scanner s = new Scanner(System.in);
    int c = s.nextInt();
    
    System.out.println("Enter speed of your vehicle");
    Scanner m = new Scanner(System.in);
    int k = m.nextInt();
    while(true) {
    	switch(c) {
    	case 1:
    		bicycle obj1 = new bicycle();
    		System.out.println("Enter 1: Incresse speed , 2: Change gear, 3: apply breaks ");
    		Scanner p = new Scanner(System.in);
    		int h = p.nextInt();
    		if(h == 1) {
    		obj1.speedUp(k);
    		}
    		else if(h==2){
    		 obj1.gearChange();
    		 }
    		else {
    			obj1.applyBreaks();
    		}
    		break;
    		
    	case 2:
    		car obj2 = new car();
    		System.out.println("Enter 1: Incresse speed , 2: Change gear, 3: apply breaks ");
    		Scanner y = new Scanner(System.in);
    		int q = y.nextInt();
    		if(q == 1) {
    		obj2.speedUp(k);
    		}
    		else if(q==2){
    		 obj2.gearChange();
    		 }
    		else {
    			obj2.applyBreaks();
    		}
    		break;
    		
    	case 3:
    		bike obj3 = new bike();
    		System.out.println("Enter 1: Incresse speed , 2: Change gear, 3: apply breaks ");
    		Scanner d = new Scanner(System.in);
    		int x = d.nextInt();
    		if(x == 1) {
    		obj3.speedUp(k);
    		}
    		else if(x==2){
    		 obj3.gearChange();
    		 }
    		else {
    			obj3.applyBreaks();
    		}
    		break;
    	case 4:
    		System.exit(0);
    	}
    }
	}

