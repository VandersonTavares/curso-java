package upcastingdowncasting;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpcastingDowncasting {
    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(500.0, 1002, "Maria", 0.0);
        
        
        //UPCASTING - (é um) pegar um objeto de subclasse e atribuir a um objeto da superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(550.0, 1003,"Bob",200.0); //é possivel pois a BusinessAccount é uma Account
        Account acc3 = new SavingsAccount(0.01, 1004, "Anna", 0.0);
        
        
        //DOWNCASTING - (Converter um objeto da superclasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0); //com o downcasting eu posso acessar o método de empréstimo em BusinessAccount com uma acc que é do tipo Account
        
        //BusinessAccount acc5 = (BusinessAccount)acc3; //dará um erro pois a acc3 é uma SavingsAccount e não uma BusinessAccount
        
        //Instanceof (Para evitar o Erro acima)
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(100.0);
            System.out.println("Fiz um empréstimo");
        }
        
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
        
        
        
    }
    
}
