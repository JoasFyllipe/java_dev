package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.00;

    public Account(Integer number, String holder){
        this.number = number;
        this.holder = holder;
    }
    public Account(Integer number, String holder, Double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }

    public Integer getNumber(){
        return number;
    }

    public Double getBalance(){
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }
    public void withDraw(Double amount){
        balance -= (amount + 5.00);
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
