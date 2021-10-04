package exc01;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd,MM,yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine(); 
        System.out.print("Level: ");
        String workerLevel = sc.nextLine(); 
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        
        //Department d = new Department(departmentName);
        //Worker w = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary, d);
        Worker w = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));
        
        
        System.out.print("How many contratc's to this worker? ");
        int n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            System.out.println("Enter Contract # "+ i +"Data:");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());//pode gerar um erro aqui - tratar exceções
            System.out.print("Valuer per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(Hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            w.addContract(contract);
        }
        
        System.out.println("Enter Month and year to calculate income Salary:(MM/YYYY):  ");
        String monthAndYear = sc.next();
        
        int month = Integer.parseInt(monthAndYear.substring(0,2));//peguei os 2 primeiros caracteres do String e converti pra inteiro
        int year = Integer.parseInt(monthAndYear.substring(3));//recorda do 3 em diante
        
        System.out.println("Name: "+w.getName());
        System.out.println("Department: "+w.getDepartment().getName());
        System.out.println("Income for "+ monthAndYear + ": "+ String.format("%.2f", w.income(year, month)));
        
        
        
    }
    
}
