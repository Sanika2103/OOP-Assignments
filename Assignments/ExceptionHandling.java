import java.util.Scanner;

class exception{
void arthmaticException( ) {
Scanner sc=new Scanner(System.in);
boolean valid;
valid=false;
while(!valid) {
try {
System.out.print("Enter Two Numbers :");
int num1=sc.nextInt();
int num2=sc.nextInt();
double c=num1/num2;
System.out.println("Division is "+c);
valid=true;
}
catch (Exception e) {
System.out.println("Cannot Divide by Zero, enter Valid Denominator");
}
}
}
void ArrayOutOfBound(int [] arr) {
Scanner sc=new Scanner(System.in);
boolean valid;
valid=false;
while(!valid) {
try {
	System.out.print("\nEnter the Index No. of Element which you want to print :");
			int i=sc.nextInt();
			System.out.println( arr[i]+" is present at given index");
			valid =true;
			}
			catch(Exception e) {
			System.out.println("Index out of bounds.");
			}
			}
			}
void NumberFormat() {
Scanner sc=new Scanner(System.in);
boolean valid=false;
while(!valid) {
try {
System.out.print("Enter first number:: ");
String num1=sc.next();
System.out.print("Enter Second number:: ");
String num2=sc.next();
int a=Integer.parseInt(num1);
int b=Integer.parseInt(num2);
System.out.println("\nEntered Numbers are integers: "+a+" ,"+b);
valid=true;
}
catch(Exception e){
System.out.println("Numbers You have Enter are not Integers.");
}
}
}
}
public class expHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception e=new exception();
		Scanner sc=new Scanner(System.in);
		int n;
		do {
		System.out.print("\n1. Arithmaticexception\n2. ArrayOutOfBound\n3. NumberFormatException\n4. Exit\nEnter the Choice which you want to check type of error: ");
		n=sc.nextInt();
		switch(n) {
		case 1:
		e.arthmaticException();
		System.out.println("==========================================================");
		break;
		case 2:
		int[] arr= {1,4,5,2,3,8};
		System.out.println("Array Size: 6");
		e.ArrayOutOfBound(arr);
		System.out.println("==========================================================");
		break;
		case 3:
		e.NumberFormat();
		System.out.println("==========================================================");
		break;
		case 4:
		n=0;
		System.out.println("==========================================================");
		break;
		default:
		System.out.println("INVALID INPUT !!!");
		System.out.println("==========================================================");
		}
	
	}while(n!=0);
	}
}

