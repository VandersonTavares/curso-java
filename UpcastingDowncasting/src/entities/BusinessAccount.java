package entities;
public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getIoanLimit() {
        return loanLimit;
    }

    public void setIoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(Double amount){
        
        
    }
}
