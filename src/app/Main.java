package app;

public class Main {

    public static void main(String[] args) {

        UserBalance account = new UserBalance(1000.00);
        UserInputReader reader = new UserInputReader();
        FundsValidator fundsValidator = new FundsValidator();

        System.out.printf("Balance is USD %.2f.%n", account.getBalance());

        double withdrawal = reader.readWithdrawalAmount();

        try {
            fundsValidator.validateAmount(account.getBalance(), withdrawal);
            account.withdraw(withdrawal);

            System.out.println("Funds are OK. Purchase paid.");
            System.out.printf("Balance is USD %.2f.%n", account.getBalance());

        } catch (FundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
