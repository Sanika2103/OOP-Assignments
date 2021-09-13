import java.util.*;
public class complex{
	  int real;
	  int img;
	  complex(){
	      this.real = this.img=0;
	  }
	  complex(int r, int i){
	      this.real = r;
	      this.img = i;
	  }
	  complex sum(complex c1, complex c2 ){
	      complex add = new complex();
	      add.real = c1.real + c2.real;
          add.img = c1.img + c2.img;
          return add;
	   }
	 complex sub(complex c1, complex c2 ){
	      complex diff = new complex();
	      diff.real = c1.real - c2.real;
          diff.img = c1.img - c2.img;
          return diff;
	   }
	   complex mult(complex c1, complex c2 ){
	      complex mul = new complex();
	      mul.real = c1.real*c2.real;
          mul.img = c1.img*c2.img;
          return mul;
	  }
	  complex division(complex c1, complex c2 ){
	      complex div = new complex();
	      div.real = c1.real/c2.real;
          div.img = c1.img/c2.img;
          return div;
	  }
  
}
public class Main
{
	
	public static void main(String[] args) {
		System.out.println("Enter real and imaginary coeff. of 1st complex number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println("Enter real and imaginary coeff. of 2nd complex number : ");
		int n = s.nextInt();
		int m = s.nextInt();
		complex c1 = new complex(n,m);
		complex c2 = new complex(n,m);
		complex add = sum(complex c1, complex c2);
		complex diff = sub(complex c1,complex c2);
		complex mul = mult(complex c1, complex c2);
		complex div = division(complex c1, complex c2);
		System.out.printf("Sum is: "+ add.real+" + "+ add.img +"i");
		System.out.printf("Difference is: "+ diff.real+" + "+ diff.img +"i");
		System.out.printf("Product is: "+ mul.real+" + "+ mul.img +"i");
		System.out.printf("Division is: "+ div.real+" + "+ div.img +"i");
	}
}
