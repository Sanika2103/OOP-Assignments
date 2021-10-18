import java.util.Scanner;

abstract class Shape{                // abstract class 
    protected double length, breadth,height, base, area;

    public abstract void compute_area();        // abstract method 

    public void display(){
        System.out.println("-----------------------------");
        System.out.println("Area is : "+area);
        System.out.println("-----------------------------");
    }
}

class Rectangle extends Shape{                 // class Rectangle is inherited from Shape
    public void setData(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void compute_area(){
        area = length*breadth;
    }
}

class Triangle extends Shape{                  // class Triangle is inherited from Shape
    public void setData(double height, double base){
        this.height = height;
        this.base = base;
    }
    public void compute_area(){
        area = 0.5*height*base;
    }
}

public class Shapeclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Rectangle
        System.out.println("\n------------ RECTANGLE -------------");
        double length, breadth;
        System.out.println("Enter the Length of the Rectangle : ");
        length = sc.nextDouble();
        System.out.println("Enter the Breadth of the Rectangle : ");
        breadth = sc.nextDouble();

        Rectangle rec = new Rectangle();  // Dynamic Binding
        rec.setData(length, breadth);   
        rec.compute_area();
        rec.display();

        //Triangle
        System.out.println("\n------------ TRIANGLE -------------");
        double height, base;
        System.out.println("Enter the Height of the Triangle : ");
        height = sc.nextDouble();
        System.out.println("Enter the Base of the Triangle : ");
        base = sc.nextDouble();

        Triangle tri = new Triangle(); // Dynamic Binding
        tri.setData(height, base);   
        tri.compute_area();
        tri.display();

        sc.close();
    }
}
