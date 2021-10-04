package entities;

import entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    //Associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();//sempre que numa associação TEM MUITOS, não incluir no construtor a lista
                                                             //instancia assim               

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    
    /* Devemos tirar esse set pois não podemos trocar a lista por uma outra.
    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    */  
    
    //faz e desfaz a associação do contrato na lista
    //adiciona na lista um novo contrato
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    //remove o contrato da lista
    public void removeContract(HourContract contract){
        contracts.remove(contract); 
    }
    
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){ 
            cal.setTime(c.getDate()); //Peguei a data do contrato MM/YYYY e joguei na variavel cal
                int c_year = cal.get(Calendar.YEAR); //recuperei o ANO da data setada
                int c_month = 1+ cal.get(Calendar.MONTH);//recuperei o MES da data setada.; Jan = 0 por isso o +1
            if(c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
    
    
}
