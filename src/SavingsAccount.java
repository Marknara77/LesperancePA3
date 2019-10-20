class SavingsAccount {

    private static double annualInterestRate;
    private double savingBalance;

    public SavingsAccount()
    {
        this.savingBalance = 0;
    }
    public SavingsAccount(double savingBalance)
    {
        this.savingBalance = savingBalance;
    }
    public double getSavingBalance()
    {
        return this.savingBalance;
    }
    public double[] getMonthsSavingBalance(int total_months)
    {
        double[] monthlyI_month = new double[total_months];
        double monthlyI;
        for(int money = 0; money < total_months; money++)
        {
            monthlyI = (double)(this.savingBalance*annualInterestRate/12);
            this.savingBalance += monthlyI;
            monthlyI_month[money] = this.savingBalance;
        }
        return monthlyI_month;
    }
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }
    public void calculateMonthlyInterest()
    {
        double monthlyI;
        monthlyI= (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
    }
}
    