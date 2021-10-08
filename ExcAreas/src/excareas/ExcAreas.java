package excareas;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcAreas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {          
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();              
                Shape rectangle = new Rectangle(width, height, color); //Upcasting
                list.add(rectangle);
            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape circle = new Circle(radius, color);//Upcasting
                list.add(circle);
            }
        }
            System.out.println();
            System.out.println("SHAPE AREAS: ");
            for(Shape s : list){
                System.out.println(s.area()); //Polimorfismo
            }

    sc.close();
    }
    
}
