package entities;
public class Company extends TaxPayer{
    private Integer numberOfEmpolyees;

    public Company() {
    }

    public Company(Integer numberOfEmpolyees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmpolyees = numberOfEmpolyees;
    }

    public Integer getNumberOfEmpolyees() {
        return numberOfEmpolyees;
    }

    public void setNumberOfEmpolyees(Integer numberOfEmpolyees) {
        this.numberOfEmpolyees = numberOfEmpolyees;
    }
        
    @Override
    public double tax() {
        if (numberOfEmpolyees < 10) {
            return super.getAnualIncome()*0.16;
        }else{
            return super.getAnualIncome()*0.14;
        }
    }
    
}
