package exercicio;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the numbre of tax Payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax Payer #"+i+" data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer taxPayer = new Individual(healthExpenditures, name, anualIncome);
                list.add(taxPayer);
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmpolyees = sc.nextInt();
                TaxPayer taxPayer = new Company(numberOfEmpolyees, name, anualIncome);
                list.add(taxPayer);
            }
        }
        
        double somaTaxa = 0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer p : list){
            somaTaxa = p.tax();
            System.out.println(p.getName()+": $"+p.tax());
            somaTaxa += somaTaxa;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: ");
        System.out.println(somaTaxa);
        
        sc.close();
    }
    
}
