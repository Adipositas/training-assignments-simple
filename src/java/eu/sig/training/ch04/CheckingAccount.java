package eu.sig.training.ch04;


public class CheckingAccount extends Account {
    private int transferLimit = 100;

	@Override
	public Transfer makeTransfer(String counterAccount, Money amount) {
		throws BusinessException {
			if (amount.greaterThan(this.transferLimit)) {
				throw new BusinessException("Limit exceeded!");
			}
			return super.makeTransfer(counterAccount, amount);
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