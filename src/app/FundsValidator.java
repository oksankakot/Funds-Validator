package app;

public class FundsValidator {

    public void validateAmount(double balance, double withdrawal) throws FundsException {
        if (withdrawal > balance) {
            throw new FundsException("Insufficient funds! Available only, USD: " + balance);
        }
        if (withdrawal <= 0) {
            throw new FundsException("Withdrawal amount must be positive!");
        }
    }
}
