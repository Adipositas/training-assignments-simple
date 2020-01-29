package eu.sig.training.ch04;

public class SavingsAccount extends Account {
	private int transferLimit = 100;
	
	@override
	public Transfer makeTransfer(String counterAccount, Money amount) {
		if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
			return super.MakeTransfer(counterAccount, amount);
		} else {
			throw new BusinessException("Invalid account number!!");
		}
	}
}

public class SavingsAccount {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;

    @override
	public Transfer makeTransfer(String counterAccount, Money amount) {
		if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
			return super.MakeTransfer(counterAccount, amount);
		} else {
			throw new BusinessException("Counter account not registrered!");
		}
	}

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
