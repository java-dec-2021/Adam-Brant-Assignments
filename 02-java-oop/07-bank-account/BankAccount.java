public class BankAccount {
    double checking_balance;
    double savings_balance;
    static int num_of_accounts;
    static double total_money_hoarded;
    public BankAccount(double checking_balance,double savings_balance,int num_of_accounts, double total_money_hoarded){
        this.checking_balance = checking_balance;
        this.savings_balance = savings_balance;
        num_of_accounts ++;
        total_money_hoarded += (this.checking_balance + this.savings_balance);
    }

    public double getCheckings(){
        return this.checking_balance;
    }
    public double getSavings(){
        return this.savings_balance;
    }
    public void depositMoney(double amount,String account){
        if(account == "checking"){
            this.checking_balance += amount;
        }
        else if(account == "savings"){
            this.savings_balance += amount;
        }
        else{
            System.out.print("sorry, wrong account type. maybe it was a typo?");
        }
        total_money_hoarded += amount;
    }
    public void withdrawMoney(double amount,String account){
        if(account == "checking"){
            if(amount > this.checking_balance){
                System.out.print("sorry, not enough in the account to withdraw.");
            }
            else{
                this.checking_balance -= amount;
                total_money_hoarded -= amount;
            }
        }
        else if(account == "savings"){
            if(amount > this.checking_balance){
                System.out.print("sorry, not enough in the account to withdraw.");
            }
            else{
                this.savings_balance -= amount;
                total_money_hoarded -= amount;
            }
        }
        else{
            System.out.print("sorry, wrong account type. maybe it was a typo?");
        }
    }
    public double displayTotal(){
        return total_money_hoarded;
    }
}
