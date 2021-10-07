package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcPolimorfismo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        
        System.out.println("How Many Employee");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per Houer: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee e = new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour);
                list.add(e);
                //posso fazer assim também
                //list.add(new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour));
                
            }else{
                Employee e = new Employee(name, hours, valuePerHour);
                list.add(e);
            }
        }
            System.out.println();
            System.out.println("Payments: ");
            //for each lê assim - para cada empregado(Employee) e, na lista.
            for(Employee e : list){
                System.out.println(e.getName()+ "- $ "+e.payment());
            }
        
        
        sc.close();
    }
    
}
