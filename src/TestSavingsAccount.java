public class TestSavingsAccount {
    public TestSavingsAccount() {
    }
    public static void main(String[] args)
    {
        SavingsAccount saver1;
        SavingsAccount saver2;
        int total = 0;
        int total_month=12;
        double[] balance_month;
        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);
        SavingsAccount.modifyInterestRate (0.04);
        balance_month = saver1.getMonthsSavingBalance(total_month);

        System.out.println("*********************************************************************");
        System.out.println("**********WELCOME****************************************************");
        System.out.println("*********************TO**********************************************");
        System.out.println("******************************SAVING*****ACCOUNT*********************");
        System.out.println("****************PROGRAMMING!!!!!!!***********************************");
        System.out.println("*********************************************************************\n");
        for(int i=0;i<total_month;i++)
        {
            System.out.println("\n Month "+(i+1)+" :\n Saver 1 balance= "+balance_month[i]+" with rate of 0.04" );
            System.out.println("*********************************************************************\n");
        }
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************\n");
        balance_month=saver2.getMonthsSavingBalance(12);
        for(int i=0;i<total_month;i++)
        {
            System.out.println("\n Month "+(i+1)+" :\n Saver 2 balance= "+balance_month[i]+" with rate of 0.04" );
            System.out.println("*********************************************************************\n");
        }
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************\n");
        SavingsAccount.modifyInterestRate(0.05);
        balance_month=saver1.getMonthsSavingBalance(12);
        for(int i=0;i<total_month;i++)
        {
            System.out.println("\n Month "+(i+1)+" :\n Saver 1 balance= "+balance_month[i]+" with rate of 0.05" );
            System.out.println("*********************************************************************\n");
        }
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************\n");
        balance_month=saver2.getMonthsSavingBalance(12);
        for(int i=0;i<total_month;i++)
        {
            System.out.println("\n Month "+(i+1)+" :\n Saver 2 balance= "+balance_month[i]+" with rate of 0.05" );
            System.out.println("*********************************************************************\n");
        }
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************");
        System.out.println("*********************************************************************\n");
    }
}